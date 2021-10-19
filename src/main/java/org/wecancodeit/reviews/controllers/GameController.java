package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.model.Category;
import org.wecancodeit.reviews.model.Game;
import org.wecancodeit.reviews.repositories.CategoryRepository;
import org.wecancodeit.reviews.repositories.HashtagRepository;
import org.wecancodeit.reviews.repositories.GameRepository;

@Controller
public class GameController {

    private GameRepository gameRepo;
    private CategoryRepository categoryRepo;
    private HashtagRepository hashtagRepo;

    public GameController(GameRepository gameRepo, CategoryRepository categoryRepo, HashtagRepository hashtagRepo) {
        this.gameRepo = gameRepo;
        this.categoryRepo = categoryRepo;
        this.hashtagRepo = hashtagRepo;
    }

    @RequestMapping("/games")
    public String showReviews(Model model){

        model.addAttribute("categories", categoryRepo.findAll());
        model.addAttribute("hashtags", hashtagRepo.findAll());

        return "games";
    }

    @RequestMapping("/games/{name}")
    public String showGame(Model model, @PathVariable String name){
        model.addAttribute("game", gameRepo.findByNameIgnoreCase(name));
        return "game";
    }

    @RequestMapping("/games/add")
    public String addGame(@RequestParam String name, @RequestParam String origin, @RequestParam String releaseYear, @RequestParam String description, @RequestParam String reviewerRating, @RequestParam String categoryName, @RequestParam String similarGames, @RequestParam String imageUrl, @RequestParam String reviewBy, @RequestParam String review){
        Category category = categoryRepo.findByNameIgnoreCase(categoryName);
        Game newGame = new Game(name, origin, releaseYear, description, reviewerRating, category, similarGames, imageUrl, reviewBy, review);
        gameRepo.save(newGame);
        return "redirect:/games/";
    }
}

package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.repositories.CategoryRepository;
import org.wecancodeit.reviews.repositories.GameRepository;
import org.wecancodeit.reviews.repositories.HashtagRepository;

@Controller
public class HashtagController {

    private GameRepository reviewRepo;
    private CategoryRepository categoryRepo;
    private HashtagRepository hashtagRepo;

    public HashtagController(GameRepository reviewRepo, CategoryRepository categoryRepo, HashtagRepository hashtagRepo) {
        this.reviewRepo = reviewRepo;
        this.categoryRepo = categoryRepo;
        this.hashtagRepo = hashtagRepo;
    }

    @RequestMapping("/hashtags")
    public String showHashtags(Model model){
        model.addAttribute("hashtags", hashtagRepo.findAll());
        return "hashtags";
    }

    @RequestMapping("/hashtags/{name}")
    public String showHashtag(Model model, @PathVariable String name){
        model.addAttribute("hashtag",hashtagRepo.findByNameIgnoreCase(name).get());
        return "hashtag";
    }
}

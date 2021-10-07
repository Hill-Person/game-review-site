package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.model.Category;
import org.wecancodeit.reviews.model.Hashtag;
import org.wecancodeit.reviews.model.Review;

import java.util.ArrayList;
import java.util.Collection;

@Controller
public class reviews {

    @RequestMapping("/")
    public String showReviews(Model model){
        Category videoGame = new Category("Video Game", "a game played with beta males over the internet.");
        Category boardGame = new Category("Board Game", "are a game played with friends around a table.");
        Hashtag MMO = new Hashtag("MMO", "Massively Multiplayer Online Games");
        Hashtag diceRolling = new Hashtag("Dice Rolling", "A game where dice rolls affect outcome");
        Hashtag strategy = new Hashtag("Strategy", "A game that asks for strategical reasoning.");
        Review newWorld = new Review("New World", "Amazon Game Studios", "2021", "an MMO", "WoW & Planetside 2", "8.5", videoGame, MMO);
        Review ludo = new Review("Ludo", "India", "c. 1896", "dice rolling game", "Pachisi", "10", boardGame, diceRolling);
        Review squadLeader = new Review("Squad Leader", "Avalon Hill", "1977", "tabletop military strategy", "Axis & Allies", "8", boardGame, strategy);

        //newWorld.addHashtag(MMO);
        //ludo.addHashtag(diceRolling);
        //squadLeader.addHashtag(strategy);

        Collection<Category> categories = new ArrayList<Category>();
        categories.add(videoGame);
        categories.add(boardGame);

        Collection<Hashtag> hashtags = new ArrayList<Hashtag>();
        hashtags.add(MMO);
        hashtags.add(diceRolling);
        hashtags.add(strategy);

        model.addAttribute("categories", categories);
        model.addAttribute("hashtags", hashtags);

        return "reviews";
    }
}

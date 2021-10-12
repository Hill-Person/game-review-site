package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.model.Category;
import org.wecancodeit.reviews.model.Hashtag;
import org.wecancodeit.reviews.model.Review;
import org.wecancodeit.reviews.repositories.CategoryRepository;
import org.wecancodeit.reviews.repositories.HashtagRepository;
import org.wecancodeit.reviews.repositories.ReviewRepository;

import java.util.ArrayList;
import java.util.Collection;

@Controller
public class ReviewController {

    private ReviewRepository reviewRepo;
    private CategoryRepository categoryRepo;
    private HashtagRepository hashtagRepo;

    public ReviewController(ReviewRepository reviewRepo, CategoryRepository categoryRepo, HashtagRepository hashtagRepo) {
        this.reviewRepo = reviewRepo;
        this.categoryRepo = categoryRepo;
        this.hashtagRepo = hashtagRepo;
    }

    @RequestMapping("/reviews")
    public String showReviews(Model model){

        model.addAttribute("categories", categoryRepo.findAll());
//        model.addAttribute("hashtags", hashtagRepo.findAll());

        return "reviews";
    }
}

package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.wecancodeit.reviews.repositories.CategoryRepository;
import org.wecancodeit.reviews.repositories.HashtagRepository;
import org.wecancodeit.reviews.repositories.ReviewRepository;

@Controller
public class CategoryController {

    private ReviewRepository reviewRepo;
    private CategoryRepository categoryRepo;
    private HashtagRepository hashtagRepo;

    public CategoryController(ReviewRepository reviewRepo, CategoryRepository categoryRepo, HashtagRepository hashtagRepo) {
        this.reviewRepo = reviewRepo;
        this.categoryRepo = categoryRepo;
        this.hashtagRepo = hashtagRepo;
    }

    public String showCategories(Model model){
        return
    }
    )
}

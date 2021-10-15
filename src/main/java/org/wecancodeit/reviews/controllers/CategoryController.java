package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/categories")
    public String getCategories(Model model){
        model.addAttribute("categories",categoryRepo.findAll());
        return "categories";

    }

    @RequestMapping("/categories/{name}")
    public String showCampus(Model model, @PathVariable String name) {
        model.addAttribute("category", categoryRepo.findByNameIgnoreCase(name));
        return "category";
    }
}

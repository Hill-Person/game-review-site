package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.model.Category;
import org.wecancodeit.reviews.model.Hashtag;
import org.wecancodeit.reviews.model.Review;
import org.wecancodeit.reviews.repositories.CategoryRepository;
import org.wecancodeit.reviews.repositories.HashtagRepository;
import org.wecancodeit.reviews.repositories.ReviewRepository;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class Populator implements CommandLineRunner {

    private ReviewRepository reviewRepo;
    private CategoryRepository categoryRepo;
    private HashtagRepository hashtagRepo;

    public Populator(ReviewRepository reviewRepo, CategoryRepository categoryRepo, HashtagRepository hashtagRepo) {
        this.reviewRepo = reviewRepo;
        this.categoryRepo = categoryRepo;
        this.hashtagRepo = hashtagRepo;
    }


    @Override
    public void run(String... args) throws Exception {
            Category videoGame = new Category("Video Game", "a game played with beta males over the internet.");
            Category boardGame = new Category("Board Game", "are a game played with friends around a table.");
            categoryRepo.save(videoGame);
            categoryRepo.save(boardGame);

//            Hashtag MMO = new Hashtag("MMO", "Massively Multiplayer Online Games");
//            Hashtag diceRolling = new Hashtag("Dice Rolling", "A game where dice rolls affect outcome");
//            Hashtag strategy = new Hashtag("Strategy", "A game that asks for strategical reasoning.");
//            hashtagRepo.save(MMO);
//            hashtagRepo.save(diceRolling);
//            hashtagRepo.save(strategy);

            Review newWorld = new Review("New World", "Amazon Game Studios", "2021", "an MMO", "WoW & Planetside 2", "8.5", videoGame);
            Review ludo = new Review("Ludo", "India", "c. 1896", "dice rolling game", "Pachisi", "10", boardGame);
            Review squadLeader = new Review("Squad Leader", "Avalon Hill", "1977", "tabletop military strategy", "Axis & Allies", "8", boardGame);
            reviewRepo.save(newWorld);
            reviewRepo.save(ludo);
            reviewRepo.save(squadLeader);

        }
}

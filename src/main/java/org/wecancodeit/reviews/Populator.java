package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.model.Category;
import org.wecancodeit.reviews.model.Game;
import org.wecancodeit.reviews.repositories.CategoryRepository;
import org.wecancodeit.reviews.repositories.HashtagRepository;
import org.wecancodeit.reviews.repositories.ReviewRepository;

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
            Category videoGame = new Category("Video Game", "a game played with beta males over the internet.","/images/videoGame.jpg");
            Category boardGame = new Category("Board Game", "are a game played with friends around a table.","/images/tableTop.jpg");
            categoryRepo.save(videoGame);
            categoryRepo.save(boardGame);

//            Hashtag MMO = new Hashtag("MMO", "Massively Multiplayer Online Games");
//            Hashtag diceRolling = new Hashtag("Dice Rolling", "A game where dice rolls affect outcome");
//            Hashtag strategy = new Hashtag("Strategy", "A game that asks for strategical reasoning.");
//            hashtagRepo.save(MMO);
//            hashtagRepo.save(diceRolling);
//            hashtagRepo.save(strategy);

            Game newWorld = new Game("New World","Amazon Game Studios","2021","MMO",8.5,videoGame,"WoW & Planetside 2","/images/newworld.jpeg");
//            Game newWorld = new Game("New World", "Amazon Game Studios", "2021", "an MMO", "WoW & Planetside 2", "8.5", videoGame);
            Game ludo = new Game("Ludo", "India", "c. 1896", "dice rolling game", 10, boardGame,"Pachisi","");
            Game squadLeader = new Game("Squad Leader", "Avalon Hill", "1977", "tabletop military strategy", 8, boardGame,"Axis and Allies","/images/squadleader.jpg");
            reviewRepo.save(newWorld);
            reviewRepo.save(ludo);
            reviewRepo.save(squadLeader);



        }
}

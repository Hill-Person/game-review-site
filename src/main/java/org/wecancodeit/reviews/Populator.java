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
            Category videoGame = new Category("Video Games", "a game played with beta males over the internet.","/images/videoGame.jpg");
            Category boardGame = new Category("Board Games", "a game played with friends around a table.","/images/tableTop.jpg");
            categoryRepo.save(videoGame);
            categoryRepo.save(boardGame);

//            Hashtag MMO = new Hashtag("MMO", "Massively Multiplayer Online Games");
//            Hashtag diceRolling = new Hashtag("Dice Rolling", "A game where dice rolls affect outcome");
//            Hashtag strategy = new Hashtag("Strategy", "A game that asks for strategical reasoning.");
//            hashtagRepo.save(MMO);
//            hashtagRepo.save(diceRolling);
//            hashtagRepo.save(strategy);

            Game newWorld = new Game("New World","Amazon Game Studios","2021","A MMORPG with a focus on Witcher style attack, dodge, and roll combat.",8.5, videoGame,"Elder Scrolls Online & Neverwinter","/images/newworld.jpeg");
            Game ludo = new Game("Ludo", "India", "c. 1896", "A strategy board game where you race from start to finish according to the rolls of a single die.", 10, boardGame,"Pachisi & Trouble","/images/ludo.jpg");
            Game squadLeader = new Game("Squad Leader", "Avalon Hill", "1977", "Command squads of soldiers in tactical WWII combat.", 8, boardGame,"Axis and Allies","/images/squadleader.jpg");
            reviewRepo.save(newWorld);
            reviewRepo.save(ludo);
            reviewRepo.save(squadLeader);



        }
}

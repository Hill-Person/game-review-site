package org.wecancodeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.reviews.model.Category;
import org.wecancodeit.reviews.model.Game;
import org.wecancodeit.reviews.model.Hashtag;
import org.wecancodeit.reviews.repositories.CategoryRepository;
import org.wecancodeit.reviews.repositories.HashtagRepository;
import org.wecancodeit.reviews.repositories.GameRepository;

@Component
public class Populator implements CommandLineRunner {

    private GameRepository reviewRepo;
    private CategoryRepository categoryRepo;
    private HashtagRepository hashtagRepo;

    public Populator(GameRepository reviewRepo, CategoryRepository categoryRepo, HashtagRepository hashtagRepo) {
        this.reviewRepo = reviewRepo;
        this.categoryRepo = categoryRepo;
        this.hashtagRepo = hashtagRepo;
    }


    @Override
    public void run(String... args) throws Exception {
            Category videoGame = new Category("Video Games", "Invented in the 1960's, video games have become a staple of household entertainment across the globe. They are played on computers or personal game consoles.","/images/videoGame.jpg");
            Category boardGame = new Category("Board Games", "Board games are thousands of years old and have come a long way in that time. Popular games today, played around a table, often involve 3D miniatures, decks of cards, and dice.","/images/tableTop.jpg");
            categoryRepo.save(videoGame);
            categoryRepo.save(boardGame);

            Hashtag MMO = new Hashtag("MMO", "Massively multiplayer online games where people from across the world team up to complete objectives.", "/images/mmo.jpg");
            Hashtag diceRolling = new Hashtag("Dice Rolling", "A game where dice rolls affect outcome", "/images/diceRolling.jpg");
            Hashtag Adventure = new Hashtag("Adventure", "The spirit of adventure lives on in gaming. Adventure games involve exploration, often involving a plot taking the player across the world.", "/images/adventure.jpg");
            Hashtag Action = new Hashtag("Action", "Action games often involve quick decisions made in the spur of the moment.", "/images/action.jpg");
            hashtagRepo.save(MMO);
            hashtagRepo.save(Action);
            hashtagRepo.save(Adventure);
            hashtagRepo.save(diceRolling)

            Game newWorld = new Game("New World","Amazon Game Studios","2021","A MMORPG with a focus on Witcher style attack, dodge, and roll combat.",8.5, videoGame,"Elder Scrolls Online & Neverwinter","/images/newworld.jpeg");
            Game ludo = new Game("Ludo", "India", "c. 1896", "A strategy board game where you race from start to finish according to the rolls of a single die.", 10, boardGame,"Pachisi & Trouble","/images/ludo.jpg");
            Game squadLeader = new Game("Squad Leader", "Avalon Hill", "1977", "Command squads of soldiers in tactical WWII combat.", 8, boardGame,"Axis and Allies","/images/squadleader.jpg");
            reviewRepo.save(newWorld);
            reviewRepo.save(ludo);
            reviewRepo.save(squadLeader);



        }
}

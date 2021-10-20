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
            Hashtag diceRolling = new Hashtag("Dice Rolling", "A game where dice rolls affect outcome.", "/images/diceRolling.jpg");
            Hashtag Adventure = new Hashtag("Adventure", "The spirit of adventure lives on in gaming. Adventure games involve exploration, often involving a plot taking the player across the world.", "/images/adventure.jpg");
            Hashtag Action = new Hashtag("Action", "Action games often involve quick decisions made in the spur of the moment.", "/images/action.jpg");
            hashtagRepo.save(MMO);
            hashtagRepo.save(Action);
            hashtagRepo.save(Adventure);
            hashtagRepo.save(diceRolling);

            Game newWorld = new Game("New World","Amazon Game Studios","2021","A MMORPG with a focus on Witcher style attack, dodge, and roll combat.","8.5/10", videoGame,"Elder Scrolls Online & Neverwinter","/images/newworld.jpeg", "Evan","New World is a massively multiplayer online (MMO) game that feels like your favorite third-person title — only with hordes of other people running around. It doesn't ask players to confine themselves to classes, only to one of three factions. Instead of a Western fantasy setting, New World feels ripped straight out of the pages of an alternate history book about the 1700s. You can challenge other players, but you'll probably want to focus more on clearing the world of Corrupted Breaches: blood-red clouds that billow around you and spawn creatures that can make short work of your character." + "<br>" +  "Review By: " + "Evan", MMO, Action, Adventure);
            Game ludo = new Game("Ludo", "Unknown (In India)", "c. 1896", "A strategy board game where you race from start to finish according to the rolls of a single die.", "10/10", boardGame,"Pachisi & Trouble","/images/ludo.jpg", "Garad", "I am far from being a snob when it comes to board games. I don't turn my nose up at dumb games like Dungeon! and I am usually happier crawling through a dungeon in search of treasure than I am matching wits with someone in a game of Chess (although I do love Chess too). While my preference is definitely for thematic games, my collection is actually pretty diverse. Ingenious sits next to Kingdom Builder which sits next to Zombicide which sits next to Lords of Waterdeep which sits next to Gears of War. Anyway, you get the idea. Despite my \"come one, come all\" attitude, there are still a few games that make me shudder: Scrabble, Trivial Pursuit, Monopoly, all the usual suspects. Parcheesi is actually one of the games that fits into that \"shuddery\" category. It just isn't a game I would have in my collection through choice." + "<br>" +  "Review By: " + "Garad", diceRolling);
            Game squadLeader = new Game("Squad Leader", "Avalon Hill", "1977", "Command squads of soldiers in tactical WWII combat.", "8/10", boardGame,"Axis and Allies","/images/squadleader.jpg", "Ty", "Squad Leader has a rich theme that matches reality. This game has theme like no other game I know. Every rule is set up to replicate real-world situations in actual WWII combat. While this makes the rule-set more involved than most of the \"Euros\" that we play frequently (especially the further you get in the system), you can get started with a set of pretty simple combat rules. Tactics and strategy are very important, and the game rewards good decisions that correspond to combat. A win in the game is likely due to a plan that would have worked well in a real-world WWII situation. On the other hand, there is a significant role of luck in the game, which makes for unpredictable and exciting situations and plenty of replay value. This is an aged but not dated game. I encourage you to check it out!" + "<br>" +  "Review By: " + "Ty", diceRolling);
            reviewRepo.save(newWorld);
            reviewRepo.save(ludo);
            reviewRepo.save(squadLeader);



        }
}

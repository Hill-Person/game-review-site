package org.wecancodeit.reviews;

public class Populator {

    Category VideoGame = new Category("Video Game", "a game played with beta males over the internet.");
    Category BoardGame = new Category("Board Game", "are a game played with friends around a table.");

    Review NewWorld = new Review("New World", "Amazon Game Studios", "2021", "an MMO", "WoW & Planetside 2", "8.5", VideoGame);
    Review Ludo = new Review("Ludo", "India", "c. 1896", "dice rolling game", "Pachisi", "10", BoardGame);
    Review SquadLeader = new Review("Squad Leader", "Avalon Hill", "1977", "tabletop military strategy", "Axis & Allies", "8", BoardGame);

}


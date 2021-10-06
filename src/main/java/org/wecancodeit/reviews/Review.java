package org.wecancodeit.reviews;

import java.util.ArrayList;

public class Review {
    private String name;
    private String origin;
    private String releaseYear;
    private String description;
    private String similarGames;
    private String review;

    public Review(String name, String origin,String releaseYear, String description, String similarGames, String review, Category category) {
        this.name = name;
        this.origin = origin;
        this.releaseYear = releaseYear;
        this.description = description;
        this.similarGames = similarGames;
        this.review = review;
        this.category = category;
    }
}

package org.wecancodeit.reviews.model;

import java.util.Arrays;
import java.util.Collection;

public class Review {
    private Category category;
    private String name;
    private String origin;
    private String releaseYear;
    private String description;
    private String similarGames;
    private String review;
    private Collection<Hashtag> hashtags;

    public Review(String name, String origin, String releaseYear, String description, String similarGames, String review, Category category, Hashtag... gameHashtags) {
        this.name = name;
        this.origin = origin;
        this.releaseYear = releaseYear;
        this.description = description;
        this.similarGames = similarGames;
        this.review = review;
        this.category = category;
        this.hashtags = Arrays.asList(gameHashtags);
    }

    public void addHashtag(Hashtag hashtag){
        hashtags.add(hashtag);
    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public String getDescription() {
        return description;
    }

    public String getSimilarGames() {
        return similarGames;
    }

    public String getReview() {
        return review;
    }

    public Collection<Hashtag> getHashtags() {
        return hashtags;
    }
}

package org.wecancodeit.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Arrays;

@Entity
public class Game {


    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String origin;
    private String releaseYear;
    private String description;
    private double reviewerRating;
    private String similarGames;
    private String imageUrl;


    @ManyToOne
    private Category category;

    public Game(String name, String origin, String releaseYear, String description, double reviewerRating, Category category, String similarGames,String imageUrl) {
        this.name = name;
        this.origin = origin;
        this.releaseYear = releaseYear;
        this.description = description;
        this.similarGames = similarGames;
        this.reviewerRating = reviewerRating;
        this.category = category;
        this.imageUrl = imageUrl;
        //this.hashtag = hashtag;
    }

    public Game() {
    }
//    public void addHashtag(Hashtag hashtag){
//        hashtags.add(hashtag);
//    }

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

    public double getReviewerRating() {
        return reviewerRating;
    }

    public String getImageUrl() {
        return imageUrl;
    }


//    public Collection<Hashtag> getHashtags() {
//        return hashtags;
//    }
}

package org.wecancodeit.reviews.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

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

    @ManyToMany
    private Collection<Hashtag> hashtags;

    public Game(String name, String origin, String releaseYear, String description, double reviewerRating, Category category, String similarGames,String imageUrl, Hashtag... hashtag) {
        this.name = name;
        this.origin = origin;
        this.releaseYear = releaseYear;
        this.description = description;
        this.similarGames = similarGames;
        this.reviewerRating = reviewerRating;
        this.category = category;
        this.imageUrl = imageUrl;
        this.hashtags = Arrays.asList(hashtag);
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

    public long getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public Collection<Hashtag> getHashtags() {
        return hashtags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id && Double.compare(game.reviewerRating, reviewerRating) == 0 && Objects.equals(name, game.name) && Objects.equals(origin, game.origin) && Objects.equals(releaseYear, game.releaseYear) && Objects.equals(description, game.description) && Objects.equals(similarGames, game.similarGames) && Objects.equals(imageUrl, game.imageUrl) && Objects.equals(category, game.category) && Objects.equals(hashtags, game.hashtags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, origin, releaseYear, description, reviewerRating, similarGames, imageUrl, category, hashtags);
    }

}

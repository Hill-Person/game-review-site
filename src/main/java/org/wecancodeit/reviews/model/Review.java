package org.wecancodeit.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Collection;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String origin;
    private String releaseYear;
    private String description;
    private String similarGames;
    private String analysis;
//    @ManyToMany
//    private Hashtag hashtag;
    @ManyToOne
    private Category category;

    public Review(String name, String origin, String releaseYear, String description, String similarGames, String analysis, Category category) {
        this.name = name;
        this.origin = origin;
        this.releaseYear = releaseYear;
        this.description = description;
        this.similarGames = similarGames;
        this.analysis = analysis;
        this.category = category;
        //this.hashtag = hashtag;
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

    public String getAnalysis() {
        return analysis;
    }

//    public Collection<Hashtag> getHashtags() {
//        return hashtags;
//    }
}

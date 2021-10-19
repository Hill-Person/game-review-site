package org.wecancodeit.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    private String imageUrl;

    @ManyToMany(mappedBy = "hashtags")
    private Collection<Game> games;

    public Hashtag(String name, String description, String imageUrl) {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public Hashtag() {

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Collection<Game> getGames() {
        return games;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hashtag hashtag = (Hashtag) o;
        return id == hashtag.id && Objects.equals(name, hashtag.name) && Objects.equals(description, hashtag.description) && Objects.equals(imageUrl, hashtag.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, imageUrl);
    }
}

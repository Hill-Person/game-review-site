package org.wecancodeit.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;

    public Hashtag(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

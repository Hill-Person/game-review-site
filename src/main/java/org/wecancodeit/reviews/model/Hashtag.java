package org.wecancodeit.reviews.model;

public class Hashtag {
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

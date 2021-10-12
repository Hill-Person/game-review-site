package org.wecancodeit.reviews.model;

import org.wecancodeit.reviews.repositories.ReviewRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "category")
    private Collection<Review> reviews;

    public Category(String name, String description) {
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

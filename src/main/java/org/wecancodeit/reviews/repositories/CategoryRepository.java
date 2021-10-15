package org.wecancodeit.reviews.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Category findByNameIgnoreCase(String name);
}

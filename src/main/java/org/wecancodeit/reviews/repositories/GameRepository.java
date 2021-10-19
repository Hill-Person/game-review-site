package org.wecancodeit.reviews.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Category;
import org.wecancodeit.reviews.model.Game;

public interface GameRepository extends CrudRepository<Game, Long> {
    Game findByNameIgnoreCase(String name);

}

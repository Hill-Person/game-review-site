package org.wecancodeit.reviews.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Game;

public interface ReviewRepository extends CrudRepository<Game, Long> {

}

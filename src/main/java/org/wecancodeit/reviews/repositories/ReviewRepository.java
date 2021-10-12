package org.wecancodeit.reviews.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {

}

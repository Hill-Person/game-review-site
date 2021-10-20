package org.wecancodeit.reviews.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Hashtag;

import java.util.Optional;

public interface HashtagRepository extends CrudRepository<Hashtag,Long> {
    Optional<Hashtag> findByNameIgnoreCase(String name);

}

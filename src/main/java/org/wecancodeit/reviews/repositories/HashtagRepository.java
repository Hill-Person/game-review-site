package org.wecancodeit.reviews.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.model.Hashtag;

public interface HashtagRepository extends CrudRepository<Hashtag,Long> {
}

package crud.Repository;

import crud.entity.ScoreEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by msimon on 19/06/17.
 */
public interface ScoreRepository extends PagingAndSortingRepository<ScoreEntity, Long> {
}

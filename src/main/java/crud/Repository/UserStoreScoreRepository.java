package crud.Repository;

import crud.entity.UserStoreScoreEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by marqu on 13/06/2017.
 */
public interface UserStoreScoreRepository extends PagingAndSortingRepository<UserStoreScoreEntity, Long> {

    public Integer findByStoreIdAndUserId

}

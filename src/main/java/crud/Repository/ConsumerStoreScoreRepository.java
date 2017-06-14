package crud.Repository;

import crud.entity.ConsumerStoreScoreEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by marqu on 13/06/2017.
 */
public interface ConsumerStoreScoreRepository extends PagingAndSortingRepository<ConsumerStoreScoreEntity, Long> {

    public Integer findByStoreIdAndConsumerId(Long storeId, Long consumerId);

}

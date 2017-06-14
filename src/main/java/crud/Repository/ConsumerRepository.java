package crud.Repository;

import crud.entity.ConsumerEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by marqu on 14/06/2017.
 */
public interface ConsumerRepository extends PagingAndSortingRepository<ConsumerEntity, Long> {
}

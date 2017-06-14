package crud.Repository;

import crud.entity.StoreEntity;
import org.springframework.data.repository.PagingAndSortingRepository;


/**
 * Created by marqu on 13/06/2017.
 */
public interface StoreRepository extends PagingAndSortingRepository<StoreEntity, Long>{

}

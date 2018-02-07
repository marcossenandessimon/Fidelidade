package crud.Repository;

import crud.entity.WalletEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by marqu on 07/02/2018.
 */
public interface WalletRepository extends PagingAndSortingRepository<WalletEntity, Long> {
}

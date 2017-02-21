package crud.Repository;

import crud.entity.UserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by marqu on 20/02/2017.
 */
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {
}

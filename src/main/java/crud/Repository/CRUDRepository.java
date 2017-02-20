package crud.Repository;

import crud.entity.CRUDEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by marqu on 20/02/2017.
 */
public interface CRUDRepository extends CrudRepository<CRUDEntity, Long> {
}

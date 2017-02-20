package crud.service;

import crud.Repository.CRUDRepository;
import crud.entity.CRUDEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by msimon on 07/02/17.
 */
@Service
public class CRUDService {

    private final CRUDRepository crudRepository;

    @Autowired
    public CRUDService(CRUDRepository crudRepository){
        this.crudRepository = crudRepository;
    }

    @Transactional
    public void createUser(CRUDEntity crudEntity){
        crudRepository.save(crudEntity);
    }

}

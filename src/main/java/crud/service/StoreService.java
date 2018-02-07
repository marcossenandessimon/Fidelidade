package crud.service;

import crud.Repository.StoreRepository;
import crud.entity.StoreEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marqu on 13/06/2017.
 */
@Service
public class StoreService {

    private final StoreRepository storeRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(StoreService.class);

    @Autowired
    public StoreService(StoreRepository storeRepository){
        this.storeRepository = storeRepository;
    }

    @Transactional
    public StoreEntity createStore(StoreEntity storeEntity){
        LOGGER.info("created store: " + storeEntity.getName());
        return storeRepository.save(storeEntity);
    }

    public Iterable<StoreEntity> getAllStores(){
        LOGGER.info("returning all stores");
        return storeRepository.findAll();

    }

    public StoreEntity findOne(Long storeId){
        return storeRepository.findOne(storeId);
    }

}

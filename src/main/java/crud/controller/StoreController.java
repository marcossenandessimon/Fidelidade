package crud.controller;

import crud.entity.ConsumerStoreScoreEntity;
import crud.entity.StoreEntity;
import crud.service.ConsumerStoreScoreService;
import crud.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marqu on 13/06/2017.
 */
@RestController
@RequestMapping(path = "/store")
public class StoreController {

    private final StoreService storeService;
    private final ConsumerStoreScoreService consumerStoreScoreService;

    @Autowired
    public StoreController(StoreService storeService, ConsumerStoreScoreService consumerStoreScoreService){
        this.storeService = storeService;
        this.consumerStoreScoreService = consumerStoreScoreService;

    }

    @RequestMapping(method = RequestMethod.POST)
    public StoreEntity createStore(@RequestBody StoreEntity storeEntity){
        return storeService.createStore(storeEntity);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<StoreEntity> getAllStores(){
        return storeService.getAllStores();
    }

    @RequestMapping(path = "/addScoreToUser")
    public ConsumerStoreScoreEntity addScore(@RequestBody ConsumerStoreScoreEntity consumerStoreScoreEntity){
        if(consumerStoreScoreEntity.getConsumerId() != null && consumerStoreScoreEntity.getStoreId() != null){

            return consumerStoreScoreService.save(consumerStoreScoreEntity);

        }
        //if(consumerStoreScoreService.findScoreByStoreAndUser(consumerStoreScoreEntity.getStoreId(), consumerStoreScoreEntity.getConsumerId()) != null){
        //}
        return null;
    }

}

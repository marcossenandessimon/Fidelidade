package crud.controller;

import crud.entity.ConsumerEntity;
import crud.entity.ConsumerStoreScoreEntity;
import crud.entity.ScoreEntity;
import crud.entity.StoreEntity;
import crud.request.ScoreRequest;
import crud.service.ConsumerService;
import crud.service.ConsumerStoreScoreService;
import crud.service.ScoreService;
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
    private final ScoreService scoreService;
    private final ConsumerService consumerService;

    @Autowired
    public StoreController(StoreService storeService, ScoreService scoreService, ConsumerService consumerService){
        this.storeService = storeService;
        this.scoreService = scoreService;
        this.consumerService = consumerService;

    }

    @RequestMapping(method = RequestMethod.POST)
    public StoreEntity createStore(@RequestBody StoreEntity storeEntity){
        return storeService.createStore(storeEntity);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<StoreEntity> getAllStores(){
        return storeService.getAllStores();
    }

    @RequestMapping(path = "/createScore")
    public ConsumerEntity addScore(@RequestBody ScoreRequest scoreRequest){

        StoreEntity storeEntity = storeService.findOne(scoreRequest.getStoreId());
        ConsumerEntity consumerEntity = consumerService.findOne(scoreRequest.getConsumerId());
        ScoreEntity scoreEntity = consumerService.findScore(storeEntity, scoreRequest.getConsumerId());

        if( scoreEntity == null){
             scoreEntity = scoreService.createScore(scoreRequest, storeEntity);
        }else{
            scoreEntity.setScore(scoreRequest.getScore());
        }

        return consumerService.addScoreToUser(consumerEntity, scoreEntity);

    }

}

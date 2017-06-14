package crud.service;

import crud.Repository.ConsumerStoreScoreRepository;
import crud.entity.ConsumerStoreScoreEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by marqu on 13/06/2017.
 */
@Service
public class ConsumerStoreScoreService {

    private ConsumerStoreScoreRepository consumerStoreScoreRepository;

    @Autowired
    public ConsumerStoreScoreService(ConsumerStoreScoreRepository consumerStoreScoreRepository){
        this.consumerStoreScoreRepository = consumerStoreScoreRepository;
    }

    public Integer findScoreByStoreAndUser(Long storeId, Long consumerId){
        return consumerStoreScoreRepository.findByStoreIdAndConsumerId(storeId, consumerId);
    }

    public ConsumerStoreScoreEntity save(ConsumerStoreScoreEntity consumerStoreScoreEntity){
        return consumerStoreScoreRepository.save(consumerStoreScoreEntity);
    }

}

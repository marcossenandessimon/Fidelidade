package crud.service;

import crud.Repository.ConsumerRepository;
import crud.entity.ConsumerEntity;
import crud.entity.ScoreEntity;
import crud.entity.StoreEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

/**
 * Created by marqu on 14/06/2017.
 */
@Service
public class ConsumerService {

    private final ConsumerRepository consumerRepository;

    @Autowired
    public ConsumerService(ConsumerRepository consumerRepository){
        this.consumerRepository = consumerRepository;
    }

    @Transactional
    public ConsumerEntity save (ConsumerEntity consumerEntity){
        return consumerRepository.save(consumerEntity);
    }

    public ConsumerEntity findOne(Long consumerId) {
        return consumerRepository.findOne(consumerId);
    }

    public ConsumerEntity addScoreToUser(ConsumerEntity consumerEntity, ScoreEntity scoreEntity){
        Set<ScoreEntity> scoreSet = consumerEntity.getScore();
        scoreSet.add(scoreEntity);
        consumerEntity.setScore(scoreSet);
        return consumerRepository.save(consumerEntity);
    }

    public ScoreEntity findScore(StoreEntity storeEntity, Long consumerId){
        ConsumerEntity consumerEntity = consumerRepository.findOne(consumerId);
        Set<ScoreEntity> scores = consumerEntity.getScore();
        for(ScoreEntity score : scores){
            if(score.getStore().equals(storeEntity)){
                return score;
            }
        }
        return null;
    }

}

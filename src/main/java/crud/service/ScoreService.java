package crud.service;

import crud.Repository.ScoreRepository;
import crud.entity.ScoreEntity;
import crud.entity.StoreEntity;
import crud.entity.UserEntity;
import crud.request.ScoreRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by marqu on 13/06/2017.
 */
@Service
public class ScoreService {

    private final ScoreRepository scoreRepository;

    @Autowired
    public ScoreService(ScoreRepository scoreRepository){
        this.scoreRepository = scoreRepository;
    }

    @Transactional
    public ScoreEntity createScore(ScoreRequest scoreRequest, StoreEntity storeEntity) {
        return scoreRepository.save(new ScoreEntity(null, storeEntity, scoreRequest.getScore()));
    }
}

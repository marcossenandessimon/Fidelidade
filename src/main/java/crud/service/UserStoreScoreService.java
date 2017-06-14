package crud.service;

import crud.Repository.UserStoreScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by marqu on 13/06/2017.
 */
public class UserStoreScoreService {

    private UserStoreScoreRepository userStoreScoreRepository;

    @Autowired
    public UserStoreScoreService(UserStoreScoreRepository userStoreScoreRepository){
        this.userStoreScoreRepository = userStoreScoreRepository;
    }

    public void findScoreByStoreAndUser(Long storeId, Long userId){
        //userStoreScoreRepository.f
    }

}

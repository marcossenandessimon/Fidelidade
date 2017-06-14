package crud.service;

import crud.Repository.ConsumerRepository;
import crud.entity.ConsumerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
    public void save (ConsumerEntity consumerEntity){
        consumerRepository.save(consumerEntity);
    }

}

package crud.service;

import crud.Repository.UserRepository;
import crud.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by msimon on 07/02/17.
 */
@Service
public class UserService {

    private final UserRepository userRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Transactional
    public UserEntity createUser(UserEntity userEntity){
        UserEntity returnUser =  userRepository.save(userEntity);
        LOGGER.info("created user: " + returnUser.getName());
        return returnUser;
    }

    public Iterable<UserEntity> getAllUsers() {
        LOGGER.info("returning all users");
        return userRepository.findAll();
    }
}

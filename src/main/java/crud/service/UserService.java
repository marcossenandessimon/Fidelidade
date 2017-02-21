package crud.service;

import crud.Repository.UserRepository;
import crud.entity.UserEntity;
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

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Transactional
    public UserEntity createUser(UserEntity userEntity){
        return userRepository.save(userEntity);
    }

    public Iterable<UserEntity> getAllUsers() {
        List<UserEntity> users = new ArrayList<>();
        return userRepository.findAll();
    }
}

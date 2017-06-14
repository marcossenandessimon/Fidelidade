package crud.controller;

import crud.entity.UserEntity;
import crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by msimon on 07/02/17.
 */

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public UserEntity addingAUser(@RequestBody UserEntity userEntity){
        return userService.createUser(userEntity);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<UserEntity> getAllUsers(){
        return userService.getAllUsers();
    }


}

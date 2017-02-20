package crud.controller;

import crud.entity.CRUDEntity;
import crud.service.CRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by msimon on 07/02/17.
 */

@RestController
public class CRUDController {

    private final CRUDService crudService;

    @Autowired
    public CRUDController(CRUDService crudService){
        this.crudService = crudService;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String firstGet(){
        return "hello world!";
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public void addingAUser(@RequestBody CRUDEntity crudEntity){

        crudService.createUser(crudEntity);

    }


}

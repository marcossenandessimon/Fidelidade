package crud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by msimon on 07/02/17.
 */

@RestController
public class CRUDController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String firstGet(){
        return "hello world!";
    }


}

package crud.controller;

import crud.entity.ConsumerEntity;
import crud.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marqu on 14/06/2017.
 */
@RestController
@RequestMapping(path = "/consumer")
public class ConsumerController {

    private ConsumerService consumerService;

    @Autowired
    public ConsumerController(ConsumerService consumerService){
        this.consumerService = consumerService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ConsumerEntity add(@RequestBody ConsumerEntity consumerEntity){
        return consumerService.save(consumerEntity);
    }

}

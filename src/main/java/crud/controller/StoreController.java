package crud.controller;

import crud.entity.StoreEntity;
import crud.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by marqu on 13/06/2017.
 */
@RestController
@RequestMapping(path = "/store")
public class StoreController {

    private final StoreService storeService;

    @Autowired
    public StoreController(StoreService storeService){
        this.storeService = storeService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public StoreEntity createStore(@RequestBody StoreEntity storeEntity){
        return storeService.createStore(storeEntity);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<StoreEntity> getAllStores(){
        return storeService.getAllStores();
    }

}

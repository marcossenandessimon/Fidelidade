package crud.controller;

import crud.entity.ConsumerEntity;
import crud.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    /*
    Cria o consumidor
     */
    @RequestMapping(method = RequestMethod.POST)
    public ConsumerEntity add(@RequestBody ConsumerEntity consumerEntity){
        return consumerService.save(consumerEntity);
    }

    /*
    Cria o QR code de inserção de pontos para o consumidor.
    inicialmente enviando o ID
    TODO:
    definir maneira de login e passar token ou algo do tipo para gerar o QR.
     */
    @RequestMapping(method = RequestMethod.GET, path = "/qr")
    public String createInitialQRCode(@RequestParam Long userId){
        return consumerService.createQR(userId);
    }

}

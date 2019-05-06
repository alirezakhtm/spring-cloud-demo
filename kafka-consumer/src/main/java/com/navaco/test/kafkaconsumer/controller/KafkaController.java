package com.navaco.test.kafkaconsumer.controller;

import com.navaco.test.kafkaconsumer.component.KafkaComponent;
import com.navaco.test.kafkaconsumer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KafkaController {

    @Autowired
    private KafkaComponent kafkaComponent;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String home(){
        return "Kafka Service";
    }


    @RequestMapping(method = RequestMethod.GET, value = "/consumer-kafka")
    public String sendUserInfoToKafka(
            @RequestParam(name = "name", required = true) String name,
            @RequestParam(name = "family", required = true) String family,
            @RequestParam(name = "ni", required = true) String ni

    ){
        kafkaComponent.setUserInfoIntoKafka(name, family, ni);
        return "OK";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    public List<User> getAllUser(){
        return kafkaComponent.getUsers();
    }

}

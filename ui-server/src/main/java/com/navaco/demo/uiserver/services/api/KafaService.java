package com.navaco.demo.uiserver.services.api;

import com.navaco.demo.uiserver.services.fallback.KafkaFallbackImpl;
import com.navaco.demo.uiserver.services.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "KAFKACONSUMER", fallback = KafkaFallbackImpl.class)
public interface KafaService {

    @RequestMapping(method = RequestMethod.GET, value = "/consumer-kafka")
    String sendUserInfoToKafka(
            @RequestParam(name = "name", required = true) String name,
            @RequestParam(name = "family", required = true) String family,
            @RequestParam(name = "ni", required = true) String ni
    );

    @RequestMapping(method = RequestMethod.GET, value = "/users")
    List<User> getAllUser();

}

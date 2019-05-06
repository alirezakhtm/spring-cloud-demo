package com.navaco.test.kafkaconsumer.consumer;

import com.google.gson.GsonBuilder;
import com.navaco.test.kafkaconsumer.model.User;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;

public class KafkaConsumer extends RemoteApplicationEvent {

    private String message;

    public KafkaConsumer(Object source, String originService, String name, String family, String ni){
        super(source, originService);
        User user = new User();
        user.setName(name);
        user.setFamily(family);
        user.setNi(ni);
        user.setId(0);
        this.message = new GsonBuilder().create().toJson(user, User.class);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

}

package com.navaco.test.kafkaconsumer.component;

import com.navaco.test.kafkaconsumer.consumer.KafkaConsumer;
import com.navaco.test.kafkaconsumer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class KafkaComponent {

    @Autowired
    private ApplicationContext context;

    private static List<User> users = new ArrayList<>();

    public void setUserInfoIntoKafka(String name, String family, String ni){
        String uniqueContextId = this.context.getId();
        KafkaConsumer kafkaConsumer = new KafkaConsumer(this, uniqueContextId, name, family, ni);
        this.context.publishEvent(kafkaConsumer);
    }

    public void setUser(User user){
        users.add(user);
    }

    public List<User> getUsers(){
        return users;
    }
}

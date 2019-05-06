package com.navaco.test.kafkaconsumer.producer;


import com.google.gson.GsonBuilder;
import com.navaco.test.kafkaconsumer.component.KafkaComponent;
import com.navaco.test.kafkaconsumer.consumer.KafkaConsumer;
import com.navaco.test.kafkaconsumer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaEventListener implements ApplicationListener<KafkaConsumer> {

    @Autowired
    private KafkaComponent kafkaComponent;

    @Override
    public void onApplicationEvent(KafkaConsumer kafkaConsumer) {
        String message = kafkaConsumer.getMessage();
        User user = new GsonBuilder().create().fromJson(message, User.class);
        System.out.println("Message Received :::: " + message);
        kafkaComponent.setUser(user);
    }
}

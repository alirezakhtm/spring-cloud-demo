package com.navaco.demo.uiserver.services.fallback;

import com.navaco.demo.uiserver.services.api.KafaService;
import com.navaco.demo.uiserver.services.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class KafkaFallbackImpl implements KafaService {
    @Override
    public String sendUserInfoToKafka(String name, String family, String ni) {
        return "NO";
    }

    @Override
    public List<User> getAllUser() {
        return new ArrayList<User>();
    }
}

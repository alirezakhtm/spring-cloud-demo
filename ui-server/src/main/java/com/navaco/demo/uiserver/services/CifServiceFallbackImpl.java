package com.navaco.demo.uiserver.services;

import com.navaco.demo.cifservice.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CifServiceFallbackImpl implements CifServices {
    @Override
    public List<User> getUserInformation() {
        User user = new User();
        user.setId(0);
        user.setName("UnKnown");
        user.setFamily("UnKnown");
        user.setNi("UnKnown");
        List<User> lst = new ArrayList<>();
        lst.add(user);
        return lst;
    }

    @Override
    public User getUserInformationByNI(String ni) {
        User user = new User();
        user.setId(0);
        user.setName("UnKnown");
        user.setFamily("UnKnown");
        user.setNi("UnKnown");
        return user;
    }
}

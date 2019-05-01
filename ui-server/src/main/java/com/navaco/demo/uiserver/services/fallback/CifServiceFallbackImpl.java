package com.navaco.demo.uiserver.services.fallback;

import com.navaco.demo.uiserver.services.api.CifServices;
import com.navaco.demo.uiserver.services.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CifServiceFallbackImpl implements CifServices {

    @Override
    public List<User> getUserInformation() {
        List<User> lst = new ArrayList<>();
        lst.add(this.getNullObject());
        return lst;
    }

    @Override
    public User getUserInformationByNI(String ni) {
        return this.getNullObject();
    }

    private User getNullObject(){
        User user = User.builder().id(0).name("Unknown").family("Unknown").ni("Unknown").build();
        return user;
    }
}

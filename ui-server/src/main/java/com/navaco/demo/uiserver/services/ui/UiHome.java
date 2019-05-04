package com.navaco.demo.uiserver.services.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(method = RequestMethod.GET)
public class UiHome {

    @RequestMapping(value = "/")
    public String gotToHomePage(){
        return "home";
    }

}

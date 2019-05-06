package com.navaco.demo.uiserver.services.ui;

import com.navaco.demo.uiserver.services.api.KafaService;
import com.navaco.demo.uiserver.services.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UiKafkaController {

    @Autowired
    private KafaService kafaService;

    @RequestMapping(method = RequestMethod.GET, value = "/rest/kafka-insert-user")
    @ResponseBody
    public String getRestKafkaInsertUser(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "family") String family,
            @RequestParam(name = "ni") String ni
    ){
        return kafaService.sendUserInfoToKafka(name, family, ni);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/rest/kafka-users")
    @ResponseBody
    public List<User> getRestUserList(){
        return kafaService.getAllUser();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/kafka-insert-user")
    public String getKafkaInsertUser(Model model){
        String rsp = kafaService.sendUserInfoToKafka("UserName", "UserFamily", "1235647867");
        if(rsp .toUpperCase()!= "NO") model.addAttribute("message", "User information send successfully.");
        else model.addAttribute("message", "Service is not accessible.");
        return "message";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/kafka-users")
    public String getUserList(Model model){
        List<User> users = kafaService.getAllUser();
        model.addAttribute("users", users);
        return "kafkauserlist";
    }



}

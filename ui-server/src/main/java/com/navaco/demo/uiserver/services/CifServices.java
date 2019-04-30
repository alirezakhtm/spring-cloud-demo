package com.navaco.demo.uiserver.services;

import com.navaco.demo.cifservice.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "CIFSERVICE", fallback = CifServiceFallbackImpl.class)
public interface CifServices {

    @RequestMapping(value = "/cif-information", method = RequestMethod.GET)
    public List<User> getUserInformation();

    @RequestMapping(value = "/cif-information-by-ni", method = RequestMethod.GET)
    public User getUserInformationByNI(@RequestParam(name = "ni", required = true) String ni);

}

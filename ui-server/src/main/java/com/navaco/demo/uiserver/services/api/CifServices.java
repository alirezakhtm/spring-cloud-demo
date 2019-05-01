package com.navaco.demo.uiserver.services.api;

import com.navaco.demo.uiserver.services.fallback.CifServiceFallbackImpl;
import com.navaco.demo.uiserver.services.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "CIFSERVICE", fallback = CifServiceFallbackImpl.class)
public interface CifServices {

    @RequestMapping(value = "/cif-information", method = RequestMethod.GET)
    List<User> getUserInformation();

    @RequestMapping(value = "/cif-information-by-ni", method = RequestMethod.GET)
    User getUserInformationByNI(@RequestParam(name = "ni", required = true) String ni);

}

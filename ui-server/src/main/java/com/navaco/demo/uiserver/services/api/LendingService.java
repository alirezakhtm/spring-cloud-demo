package com.navaco.demo.uiserver.services.api;

import com.navaco.demo.uiserver.services.fallback.LendingServiceFallbackImpl;
import com.navaco.demo.uiserver.services.model.Lending;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "LENDINGSERVICE", fallback = LendingServiceFallbackImpl.class)
public interface LendingService {
    @RequestMapping(value = "/lending-info-by-ni", method = RequestMethod.GET)
    List<Lending> getLendingByNi(@RequestParam(name = "ni", required = true) String ni);

    @RequestMapping(value = "/lending-info", method = RequestMethod.GET)
    List<Lending> getAllLending();
}

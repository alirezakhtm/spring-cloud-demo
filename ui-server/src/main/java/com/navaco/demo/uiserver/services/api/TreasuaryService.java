package com.navaco.demo.uiserver.services.api;

import com.navaco.demo.uiserver.services.fallback.TreasuaryServiceFallbackImpl;
import com.navaco.demo.uiserver.services.model.Treasuary;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "TREASUARYSERVICE", fallback = TreasuaryServiceFallbackImpl.class)
public interface TreasuaryService {

    @RequestMapping(value = "/treasuary-info", method = RequestMethod.GET)
    List<Treasuary> getAllTreasuaryInformation();

    @RequestMapping(value = "/treasuary-info-by-ni", method = RequestMethod.GET)
    Treasuary getTreasuaryByNI(@RequestParam(name = "ni", required = true) String ni);

}

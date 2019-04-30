package com.navaco.demo.lendingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LendingController {

    @Autowired
    private LendingRepository lendingRepository;

    @RequestMapping(value = "/lending-info-by-ni", method = RequestMethod.GET)
    public List<Lending> getLendingByNi(@RequestParam(name = "ni", required = true) String ni){
        return this.lendingRepository.findByNi(ni);
    }

    @RequestMapping(value = "/lending-info", method = RequestMethod.GET)
    public List<Lending> getAllLending(){
        return (List<Lending>) this.lendingRepository.findAll();
    }

}

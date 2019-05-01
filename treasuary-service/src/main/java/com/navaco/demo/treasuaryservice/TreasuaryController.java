package com.navaco.demo.treasuaryservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TreasuaryController {

    @Autowired
    private TreasuaryRepository treasuaryRepository;

    @RequestMapping(value = "/treasuary-info", method = RequestMethod.GET)
    public List<Treasuary> getAllTreasuaryInformation(){
        return (List<Treasuary>) this.treasuaryRepository.findAll();
    }

    @RequestMapping(value = "/treasuary-info-by-ni", method = RequestMethod.GET)
    public Treasuary getTreasuaryByNI(@RequestParam(name = "ni", required = true) String ni){
        return this.treasuaryRepository.findAllByNi(ni);
    }


}

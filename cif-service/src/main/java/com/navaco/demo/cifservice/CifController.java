package com.navaco.demo.cifservice;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class CifController {

    @Autowired
    private CifRepository cifRepository;

    @RequestMapping(value = "/cif-information", method = RequestMethod.GET)
    public List<User> getUserInformation() {
        return (List<User>) this.cifRepository.findAll();
    }

    @RequestMapping(value = "/cif-information-by-id", method = RequestMethod.GET)
    public User getUserInformationById(@RequestParam(name = "id", required = true) long id) {
        return this.cifRepository.findUserById(id);
    }

    @RequestMapping(value = "/cif-information-by-name", method = RequestMethod.GET)
    public User getUserInformationByName(@RequestParam(name = "name", required = true) String name) {
        return this.cifRepository.findUserByName(name);
    }

    @RequestMapping(value = "/cif-information-by-ni", method = RequestMethod.GET)
    public User getUserInformationByNI(@RequestParam(name = "ni", required = true) String ni) {
        return this.cifRepository.findUserByNi(ni);
    }

}

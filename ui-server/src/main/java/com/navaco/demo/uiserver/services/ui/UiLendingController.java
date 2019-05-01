package com.navaco.demo.uiserver.services.ui;

import com.navaco.demo.uiserver.services.api.LendingService;
import com.navaco.demo.uiserver.services.model.Lending;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UiLendingController {

    @Autowired
    private LendingService lendingService;

    @RequestMapping(value = "/rest/lending-all", method = RequestMethod.GET)
    @ResponseBody
    public List<Lending> getRestLendingInformation(){
        return this.lendingService.getAllLending();
    }

    @RequestMapping(value = "/rest/lending-ni", method = RequestMethod.GET)
    @ResponseBody
    public List<Lending> getRestLendingInformationByNI(@RequestParam(name = "ni", required = true) String ni){
        return this.lendingService.getLendingByNi(ni);
    }

    @RequestMapping(value = "/lending-all", method = RequestMethod.GET)
    public String showLendingTable(Model model){
        List<Lending> lendings = this.lendingService.getAllLending();
        model.addAttribute("lendings", lendings);
        return "lendinginfo";
    }
}

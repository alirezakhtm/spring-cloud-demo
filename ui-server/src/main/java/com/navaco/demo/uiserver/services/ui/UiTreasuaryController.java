package com.navaco.demo.uiserver.services.ui;

import com.navaco.demo.uiserver.services.api.TreasuaryService;
import com.navaco.demo.uiserver.services.model.Treasuary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UiTreasuaryController {

    @Autowired
    private TreasuaryService treasuaryService;

    @RequestMapping(value = "/rest/treasury-all", method = RequestMethod.GET)
    @ResponseBody
    public List<Treasuary> getRestTreasuaryAll(){
        return this.treasuaryService.getAllTreasuaryInformation();
    }

    @RequestMapping(value = "/rest/treasury-ni", method = RequestMethod.GET)
    @ResponseBody
    public Treasuary getRestTreasuaryByNi(@RequestParam(name = "ni", required = true) String ni){
        return this.treasuaryService.getTreasuaryByNI(ni);
    }

    @RequestMapping(value = "/treasuary-all", method = RequestMethod.GET)
    public String showTreasuaryTable(Model model){
        model.addAttribute("treasuaries", this.treasuaryService.getAllTreasuaryInformation());
        return "treasuaryinfo";
    }



}

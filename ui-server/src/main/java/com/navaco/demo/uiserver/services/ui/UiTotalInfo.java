package com.navaco.demo.uiserver.services.ui;

import com.navaco.demo.uiserver.services.business.TotalInfoTbl;
import com.navaco.demo.uiserver.services.model.TotalInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UiTotalInfo {

    @Autowired
    private TotalInfoTbl totalInfoTbl;

    @RequestMapping(method = RequestMethod.GET, value = "/total-info")
    public String showTotalInfoTable(Model model){
        List<TotalInfo> totalInfos = this.totalInfoTbl.getAllInfo();
        model.addAttribute("totalInfos", totalInfos);
        return "totalinfo";
    }

}

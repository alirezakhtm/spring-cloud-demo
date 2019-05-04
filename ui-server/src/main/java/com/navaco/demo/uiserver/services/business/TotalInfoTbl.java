package com.navaco.demo.uiserver.services.business;

import com.navaco.demo.uiserver.services.api.CifServices;
import com.navaco.demo.uiserver.services.api.LendingService;
import com.navaco.demo.uiserver.services.api.TreasuaryService;
import com.navaco.demo.uiserver.services.model.Lending;
import com.navaco.demo.uiserver.services.model.TotalInfo;
import com.navaco.demo.uiserver.services.model.Treasuary;
import com.navaco.demo.uiserver.services.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TotalInfoTbl {

    @Autowired
    private CifServices cifServices;

    @Autowired
    private LendingService lendingService;

    @Autowired
    private TreasuaryService treasuaryService;

    public List<TotalInfo> getAllInfo(){
        List<TotalInfo> infoUsers = new ArrayList<>();
        // get user info from CIF service
        List<User> users = this.cifServices.getUserInformation();
        users.forEach(
                user -> {
                    // get money of per user from treasury service
                    Treasuary treasuary = this.treasuaryService.getTreasuaryByNI(user.getNi());
                    // get lending for per user from lending service
                    List<Lending> lendings = this.lendingService.getLendingByNi(user.getNi());
                    // create object for answer list
                    TotalInfo totalInfo = new TotalInfo();
                    totalInfo.setNi(user.getNi());
                    totalInfo.setName(user.getName());
                    totalInfo.setFamily(user.getFamily());
                    totalInfo.setLending(this.convertLendingListToString(lendings));
                    totalInfo.setTreasury(treasuary.getMoney());
                    infoUsers.add(totalInfo);
                }
        );
        return infoUsers;
    }

    private String convertLendingListToString(List<Lending> list){
        StringBuilder stringBuilder = new StringBuilder();
        list.forEach(lending -> stringBuilder.append(lending.getLening() + ", "));
        return stringBuilder.toString();
    }

}

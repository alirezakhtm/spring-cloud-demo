package com.navaco.demo.uiserver.services.fallback;

import com.navaco.demo.uiserver.services.api.TreasuaryService;
import com.navaco.demo.uiserver.services.model.Treasuary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TreasuaryServiceFallbackImpl implements TreasuaryService {
    @Override
    public List<Treasuary> getAllTreasuaryInformation() {
        return this.getNullList();
    }

    @Override
    public Treasuary getTreasuaryByNI(String ni) {
        return this.getNullObject();
    }

    private Treasuary getNullObject() {
        return Treasuary.builder().id(0).money("Unknown").ni("Unknown").build();
    }

    private List<Treasuary> getNullList(){
        List<Treasuary> treasuaries = new ArrayList<>();
        treasuaries.add(this.getNullObject());
        return treasuaries;
    }
}

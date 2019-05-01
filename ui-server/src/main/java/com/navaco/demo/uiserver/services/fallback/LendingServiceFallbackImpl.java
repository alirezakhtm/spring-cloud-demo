package com.navaco.demo.uiserver.services.fallback;

import com.navaco.demo.uiserver.services.api.LendingService;
import com.navaco.demo.uiserver.services.model.Lending;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LendingServiceFallbackImpl implements LendingService {

    @Override
    public List<Lending> getLendingByNi(String ni) {
        return this.getNullList();
    }

    @Override
    public List<Lending> getAllLending() {
        return this.getNullList();
    }

    private Lending getNullObject(){
        Lending lending = Lending.builder().id(0).lening("Unknown").ni("Unknown").build();
        return lending;
    }

    private List<Lending> getNullList(){
        List<Lending> lendings = new ArrayList<>();
        lendings.add(this.getNullObject());
        return lendings;
    }
}

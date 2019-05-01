package com.navaco.demo.uiserver.services.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Lending {

    private long id;
    private String ni;
    private String lening;

}

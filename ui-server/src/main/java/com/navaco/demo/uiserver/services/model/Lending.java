package com.navaco.demo.uiserver.services.model;

//import lombok.Builder;
//import lombok.Getter;
//import lombok.Setter;

//@Getter
//@Setter
//@Builder
public class Lending {

    private long id;
    private String ni;
    private String lening;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNi() {
        return ni;
    }

    public void setNi(String ni) {
        this.ni = ni;
    }

    public String getLening() {
        return lening;
    }

    public void setLening(String lening) {
        this.lening = lening;
    }
}

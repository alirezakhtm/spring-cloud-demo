package com.navaco.demo.uiserver.services.model;

//import lombok.Builder;
//import lombok.Getter;
//import lombok.Setter;

//@Getter
//@Setter
//@Builder
public class Treasuary {

    private long id;
    private String ni;
    private String money;

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

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}

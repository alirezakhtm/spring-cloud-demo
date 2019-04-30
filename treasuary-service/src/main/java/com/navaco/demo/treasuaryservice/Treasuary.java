package com.navaco.demo.treasuaryservice;

import javax.persistence.*;

@Entity
@Table(name = "TBL_TREASUARY")
public class Treasuary {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "NI")
    private String ni;
    @Column(name = "MONEY")
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

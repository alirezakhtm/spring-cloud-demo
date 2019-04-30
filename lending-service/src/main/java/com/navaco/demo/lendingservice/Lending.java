package com.navaco.demo.lendingservice;

import javax.persistence.*;

@Entity
@Table(name = "TBL_LENDING")
public class Lending {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "NI")
    private String ni;
    @Column(name = "LENDING")
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

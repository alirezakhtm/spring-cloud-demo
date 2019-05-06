package com.navaco.test.kafkaconsumer.model;

public class User {

    private long id;
    private String ni;
    private String name;
    private String family;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}

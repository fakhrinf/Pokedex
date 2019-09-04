package com.fakhrinf.pokedex.model;

public class Pokemon {

    private String name;
    private String type;
    private String catchprobability;
    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCatchprobability() {
        return catchprobability;
    }

    public void setCatchprobability(String catchprobability) {
        this.catchprobability = catchprobability;
    }
}

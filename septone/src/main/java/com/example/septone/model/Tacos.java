package com.example.septone.model;

public class Tacos {
    private String meat;
    private String spicy;
    private String shell;

    public Tacos(String meatParam, String spicyParam, String shellParam){
        this.meat = meatParam;
        this.spicy = spicyParam;
        this.shell = shellParam;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getShell() {
        return shell;
    }

    public void setShell(String shell) {
        this.shell = shell;
    }

    public String getSpicy() {
        return spicy;
    }

    public void setSpicy(String spicy) {
        this.spicy = spicy;
    }
}

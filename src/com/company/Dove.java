package com.company;

public class Dove extends Bird {


    private int talons;
    private int fieldOfView;
    private String color;

    public int getTalons() {
        return talons;
    }

    public void setTalons(int talons) {
        this.talons = talons;
    }

    public int getFieldOfView() {
        return fieldOfView;
    }

    public void setFieldOfView(int fieldOfView) {
        this.fieldOfView = fieldOfView;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dove(int talons, int fieldOfView, String color) {
        this.talons = talons;
        this.fieldOfView = fieldOfView;
        this.color = color;
    }
}

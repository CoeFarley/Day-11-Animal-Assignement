package com.company;

public class Eagle extends Bird{

    private int talons;
    private int fieldOfView;
    private boolean bald;

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

    public boolean isBald() {
        return bald;
    }

    public void setBald(boolean bald) {
        this.bald = bald;
    }


    public Eagle(int talons, int fieldOfView, boolean bald) {
        this.talons = talons;
        this.fieldOfView = fieldOfView;
        this.bald = bald;
    }
}

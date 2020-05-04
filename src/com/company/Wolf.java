package com.company;

public class Wolf extends Mamal{

    private int fangs;
    private boolean winterWolf;
    private String coatThickness;


    public int getFangs() {
        return fangs;
    }

    public void setFangs(int fangs) {
        this.fangs = fangs;
    }

    public boolean isWinterWolf() {
        return winterWolf;
    }

    public void setWinterWolf(boolean winterWolf) {
        this.winterWolf = winterWolf;
    }

    public String getCoatThickness() {
        return coatThickness;
    }

    public void setCoatThickness(String coatThickness) {
        this.coatThickness = coatThickness;
    }

    public Wolf(int fangs, boolean winterWolf, String coatThickness) {
        this.fangs = fangs;
        this.winterWolf = winterWolf;
        this.coatThickness = coatThickness;
    }
}

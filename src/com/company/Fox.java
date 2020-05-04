package com.company;

public class Fox extends Mamal{

    private int fangs;
    private boolean shy;
    private String coatColor;

    public int getFangs() {
        return fangs;
    }

    public void setFangs(int fangs) {
        this.fangs = fangs;
    }

    public boolean isShy() {
        return shy;
    }

    public void setShy(boolean shy) {
        this.shy = shy;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    public Fox(int fangs, boolean shy, String coatColor) {
        this.fangs = fangs;
        this.shy = shy;
        this.coatColor = coatColor;
    }
}

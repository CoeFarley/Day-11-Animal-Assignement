package com.company;

public class Alligator {

    private int jawVolume;
    private boolean hostile;
    private String murderer;

    public int getJawVolume() {
        return jawVolume;
    }

    public void setJawVolume(int jawVolume) {
        this.jawVolume = jawVolume;
    }

    public boolean isHostile() {
        return hostile;
    }

    public void setHostile(boolean hostile) {
        this.hostile = hostile;
    }

    public String getMurderer() {
        return murderer;
    }

    public void setMurderer(String murderer) {
        this.murderer = murderer;
    }

    public Alligator(int jawVolume, boolean hostile, String murderer) {
        this.jawVolume = jawVolume;
        this.hostile = hostile;
        this.murderer = murderer;
    }
}

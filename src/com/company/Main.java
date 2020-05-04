package com.company;

public class Main {

    public static void main(String[] args) {

        Dove firstDove = new Dove(6, 220, "White");
        Eagle firstEagle = new Eagle(8, 240, true);
        Wolf wolfBuddy = new Wolf(20, false, "mild");
        Fox littleFox = new Fox(30, true, "Red");
        Alligator angryAlligator = new Alligator(920, true, "Yes - Caution Advised");






        System.out.println(firstDove.getTalons() + ", " + firstDove.getFieldOfView() + ", " + firstDove.getColor());
        System.out.println(firstEagle.getTalons() + ", " + firstEagle.getFieldOfView() + ", " + firstEagle.isBald());
        System.out.println(wolfBuddy.getFangs() + ", " + wolfBuddy.isWinterWolf() + ", " + wolfBuddy.getCoatThickness());
        System.out.println(littleFox.getFangs() + ", " + littleFox.isShy() + ", " + littleFox.getCoatColor());
        System.out.println(angryAlligator.getJawVolume() + ", " + angryAlligator.isHostile() + ", " + angryAlligator.getMurderer());

    }
}

package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

    public String getModelName() {
        return "Honda City";
    }

    public String getRegistrationNumber() {
        return "TS09CD5678";
    }

    public String getOwnerName() {
        return "Kiran";
    }

    public int getSpeed() {
        return 120;
    }

    public void cdplayer() {
        System.out.println("CD Player is ON");
    }
}
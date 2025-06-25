package org.example;

public class Speaker extends ElectricDevice{
    public void operateSpeaker() {
        swicthOn();
        controlVolume();
    }
    public void controlVolume() {
        System.out.println("control volume");
    }
}

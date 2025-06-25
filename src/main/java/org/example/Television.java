package org.example;

public class Television extends FrequecyDevice{
    public void changeResolution() {
        System.out.println("chang resolution");
    }
    public void operateTelevision() {
        swicthOn();
        channelTuning();
        controlVolume();
        changeResolution();
    }
}

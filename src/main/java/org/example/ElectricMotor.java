package org.example;

public class ElectricMotor extends ElectricDevice{
    public void operateMotor() {
        swicthOn();
        controlSpeed();
    }

    public void controlSpeed() {
        System.out.println("control speed");
    }
}

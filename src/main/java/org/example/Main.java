package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Television television = new Television();
        Radio radio = new Radio();
        Speaker speaker = new Speaker();
        ElectricMotor electricMotor = new ElectricMotor();
        MechanicalMotor mechanicalMotor = new MechanicalMotor();
        Dryer dryer = new Dryer(); // מייבש כביסה
        WashingMachine washingMachine = new WashingMachine();// מכונת כביסה

        Remote(television, radio, speaker, electricMotor, mechanicalMotor, dryer, washingMachine); // שלט

    }
    public static void Remote(Television television,  Radio radio, Speaker speaker, ElectricMotor electricMotor, MechanicalMotor mechanicalMotor, Dryer dryer, WashingMachine washingMachine) { // שלט
        television.operateTelevision();
        radio.operateRadio();
        speaker.operateSpeaker();
        electricMotor.operateMotor();
        mechanicalMotor.operateMotor();
        dryer.operateDryer();
        washingMachine.operateWashingMachine();
    }
}
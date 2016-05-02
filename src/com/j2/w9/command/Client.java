package com.j2.w9.command;



public class Client{
  public static void main(String[] args){
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();
    GarageDoor garage = new GarageDoor();
    LightOnCommand lightOn = new LightOnCommand(light);
    GarageOpenCommand garageOn = new GarageOpenCommand(garage);
    remote.setCommand(lightOn);
    remote.buttonPressed();
    remote.setCommand(garageOn);
    remote.buttonPressed();
  }
}
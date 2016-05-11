package com.j2.w11.facade;


public class Amplifier{
  DvdPlayer dvd;
  public Amplifier(){}
  public void on(){
    System.out.println("Amp on!");
  }
  public void off(){
    System.out.println("Amp off!");
  }
  public void setVolume(int volume){
    System.out.println("Set Volume : " + volume);
  }
}
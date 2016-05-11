package com.j2.w11.facade;


public class HomeTheaterTestDrive {
  public static void main(String[] args){
    Amplifier amp = new Amplifier();
    Tuner tuner = new Tuner();
    DvdPlayer dvd = new DvdPlayer();
    Projector projector = new Projector();
      
    HomeTheaterFacade ht = new HomeTheaterFacade(amp, tuner, dvd, projector);
    
    ht.watchMovie("Let it go");
    ht.endMovie();
  }
}
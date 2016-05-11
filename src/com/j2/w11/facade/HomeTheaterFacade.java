package com.j2.w11.facade;


public class HomeTheaterFacade{
  private Amplifier amp;
  private Tuner tuner;
  private DvdPlayer dvd;
  private Projector projector;
  public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, Projector projector){
    this.amp = amp;
    this.tuner = tuner;
    this.dvd = dvd;
    this.projector = projector;
  }
  public void watchMovie(String movie){
    System.out.println("Get ready up watch a movie...");
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setVolume(5);
    tuner.on();
    dvd.on();
    dvd.play(movie);
  }
  public void endMovie(){
    amp.off();
    tuner.off();
    dvd.stop();
    dvd.eject();
    dvd.off();
    projector.off();
  }
}
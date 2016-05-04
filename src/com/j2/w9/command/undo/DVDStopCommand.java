package com.j2.w9.command.undo;


public class DVDStopCommand implements Command{
  private DVDPlayer dvd;
  int time;
  public DVDStopCommand(DVDPlayer dvd) {
    this.dvd=dvd;
  }
  public void execute(){
    dvd.stop();
  }
  public void undo(){
    dvd.move(time);
  }
}
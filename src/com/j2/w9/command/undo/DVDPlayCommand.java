package com.j2.w9.command.undo;


public class DVDPlayCommand implements Command{
  private DVDPlayer dvd;
  int time;
  public DVDPlayCommand(DVDPlayer dvd) {
    this.dvd=dvd;
  }
  public void execute(){
    dvd.play();
  }
  public void undo(){
    dvd.move(time);
  }
}
package com.j2.forFinal.facade;


public class FacadeTestDrive{
  public static void main(String [] args){
    Screen screen = new Screen();
    Audio audio = new Audio();
    
    HomeTheater ht = new HomeTheater(screen, audio);
    ht.startMovie();
  }
}
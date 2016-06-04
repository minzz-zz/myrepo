package com.j2.w14.state.exercise;


public class DvdPlayerTestDrive{
  public static void main(String [] args){
    DvdPlayer dp = new DvdPlayer();
    dp.play();
    dp.pause();
    dp.stop();
    dp.pause();
    dp.play();
    dp.end();
  }
}
package com.j2.w11.facade;


public class DvdPlayer{
  public DvdPlayer(){}
  public void on(){
    System.out.println("DVD on!");
  }
  public void off(){
    System.out.println("DVD off!");
  }
  public void play(String movie){
    System.out.println(movie + " play...");
  }
  public void stop(){
    System.out.println("DVD Stop");
  }
  public void eject(){
    System.out.println("DVD eject!");
  }
}
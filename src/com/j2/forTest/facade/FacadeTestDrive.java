package com.j2.forTest.facade;

public class FacadeTestDrive{
  public static void main(String [] args){
  TV tv = new TV();
  Audio audio = new Audio();
  Light light = new Light();
  Facade facade = new Facade(tv, audio, light);
  facade.startMovie();
  System.out.println();
  System.out.println();
  facade.endMovie();
  }
}
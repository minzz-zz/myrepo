package com.j2.w7.singleton;

public class ChocolateMain{
  public static void main(String[] args){
    ChocolateBoiler boiler=ChocolateBoiler.getInstance();
    boiler.fill();
    ChocolateBoiler boiler2=ChocolateBoiler.getInstance();
  }
}
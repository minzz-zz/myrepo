package com.j2.forTest.decorator;


public class StarbuzzCoffee{
  public static void main(String[] args){
    Beverage b1 = new Espresso();
    System.out.println(b1.getDescription());
    System.out.println(b1.cost());
    Beverage b2 = new Espresso();
    b2 = new Mocha(b2);
    System.out.println(b2.getDescription());
    System.out.println(b2.cost());
  }
}
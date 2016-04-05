/*
 * author mjk
 * since 160405
 */

package com.j2.w5;

public class w5_caramel{
  public static void main(String []args){
    Beverage CaramelMacchiato = new Espresso();
    CaramelMacchiato = new Milk(CaramelMacchiato);
    CaramelMacchiato = new Vanilla(CaramelMacchiato);
    CaramelMacchiato = new Caramel(CaramelMacchiato);
    System.out.println(CaramelMacchiato.getDescription() + " $"+CaramelMacchiato.cost());
  }
}
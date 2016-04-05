/*
 * @author mjk
 * @since 160404
 */

package com.j2.w5;

public class Milk extends CondimentDecorator{
  Beverage br;
  public Milk(Beverage br){
    this.br=br;
  }
  
  public String getDescription(){
    return br.getDescription()+", Milk";
  }
  
  public double cost(){
    return br.cost()+.50;
  }
}
/*
 * @author mjk
 * @since 160404
 */

package com.j2.w5;

public class Mocha extends CondimentDecorator{
  Beverage br;
  public Mocha(Beverage br){
    this.br=br;
  }
  
  public String getDescription(){
    return br.getDescription()+", Mocha";
  }
  
  public double cost(){
    return br.cost()+.20;
  }
}
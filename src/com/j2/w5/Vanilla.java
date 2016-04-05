/*
 * @author mjk
 * @since 160404
 */

package com.j2.w5;

public class Vanilla extends CondimentDecorator{
  Beverage br;
  public Vanilla(Beverage br){
    this.br=br;
  }
  
  public String getDescription(){
    return br.getDescription()+", Vanilla";
  }
  
  public double cost(){
    return br.cost()+.20;
  }
}
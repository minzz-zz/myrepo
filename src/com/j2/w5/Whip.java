/*
 * @author mjk
 * @since 160404
 */

package com.j2.w5;

public class Whip extends CondimentDecorator{
  Beverage br;
  public Whip(Beverage br){
    this.br=br;
  }
  
  public String getDescription(){
    return br.getDescription()+", Whip";
  }
  
  public double cost(){
    return br.cost()+.10;
  }
}
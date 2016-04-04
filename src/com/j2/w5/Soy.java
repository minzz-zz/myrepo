/*
 * @author mjk
 * @since 160404
 */

package com.j2.w5;

public class Soy extends CondimentDecorator{
  Beverage br;
  public Soy(Beverage br){
    this.br=br;
  }
  
  public String getDescription(){
    return br.getDescription()+", Soy";
  }
  
  public double cost(){
    return br.cost()+.15;
  }
}
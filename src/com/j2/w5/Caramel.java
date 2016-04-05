/*
 * @author mjk
 * @since 160405
 */

package com.j2.w5;

public class Caramel extends CondimentDecorator{
  Beverage br;
  public Caramel(Beverage br){
    this.br=br;
  }
  
  public String getDescription(){
    return br.getDescription()+", Caramel";
  }
  
  public double cost(){
    return br.cost()+.30;
  }
}
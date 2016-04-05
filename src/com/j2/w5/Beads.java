/* 
 * author mjk
 * since 160405
 * practice for decorator pattern
 * I make the decorator pattern with system of making custom phone case
 */
package com.j2.w5;

public class Beads extends CondimentDecoratorforPhone{
  Phonecase customer;
  public Beads(Phonecase customer){
    this.customer=customer;
  }
  public String getDescription(){
    return customer.getDescription()+ " + Beads";
  }
    public int cost(){
        return customer.cost()+1000;
    }
  }
/* 
 * author mjk
 * since 160405
 * practice for decorator pattern
 * I make the decorator pattern with system of making custom phone case
 */
package com.j2.w5;

public class Cream extends CondimentDecoratorforPhone{
  Phonecase customer;
  public Cream(Phonecase customer){
    this.customer=customer;
  }
  public String getDescription(){
    return customer.getDescription()+ " + Cream";
  }
    public int cost(){
        return customer.cost()+3000;
    }
  }
/* 
 * author mjk
 * since 160405
 * practice for decorator pattern
 * I make the decorator pattern with system of making custom phone case
 */
package com.j2.w5;
import java.util.Scanner;


public class Initial extends CondimentDecoratorforPhone{
  Phonecase customer;
  Scanner sc =  new Scanner(System.in);
  int count;
  public Initial(Phonecase customer){
    this.customer=customer;
  }
  public String getDescription(){
      System.out.println("Please enter number of your initial: ");
  count=sc.nextInt();
    return customer.getDescription()+ " + " + count + " Initial";
  }
    public int cost(){
      if (count<=3){
        return customer.cost()+2000;
      }
      else{
        return customer.cost()+3000;
      }
    }
  }
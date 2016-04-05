/* 
 * author mjk
 * since 160405
 * practice for decorator pattern
 * I make the decorator pattern with system of making custom phone case
 */

package com.j2.w5;
import java.util.Scanner;

public class ChangeColor extends CondimentDecoratorforPhone{
  Phonecase customer;
  String color;
  Scanner sc = new Scanner(System.in);
  public ChangeColor(Phonecase customer){
    this.customer=customer;
  }
  public String getDescription(){
    System.out.println("Please enter the color that you want to change");
    color=sc.nextLine();
    return customer.getDescription()+ " + Change Color to " + color;
  }
    public int cost(){
        return customer.cost()+2000;
    }
  }
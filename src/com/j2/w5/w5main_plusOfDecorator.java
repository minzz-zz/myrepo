/* 
 * author mjk
 * since 160405
 * practice for decorator pattern
 * I make the decorator pattern with system of making custom phone case
 */

package com.j2.w5;

public class w5main_plusOfDecorator{
  public static void main(String []args){
    Phonecase mjk = new Jelly();
    mjk = new Initial(mjk);
    mjk = new Cream(mjk);
    mjk = new Beads(mjk);
    System.out.println(mjk.getDescription() + ", total cost = " + mjk.cost());
    Phonecase khk = new Plastic();
    khk = new Initial(khk);
    khk = new ChangeColor(khk);
    System.out.println(khk.getDescription() + ", total cost = " + khk.cost());
  }
}
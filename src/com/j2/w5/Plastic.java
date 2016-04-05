/* 
 * author mjk
 * since 160405
 * practice for decorator pattern
 * I make the decorator pattern with system of making custom phone case
 */

package com.j2.w5;

public class Plastic extends Phonecase{
  public Plastic(){
    description="Plastic case";
  }
  
  public int cost(){
    return 7000;
  }
}
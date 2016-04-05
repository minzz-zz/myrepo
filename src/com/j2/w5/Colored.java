/* 
 * author mjk
 * since 160405
 * practice for decorator pattern
 * I make the decorator pattern with system of making custom phone case
 */

package com.j2.w5;

public class Colored extends Phonecase{
  public Colored(){
    description="Colored case";
  }
  
  public int cost(){
    return 8000;
  }
}
/* 
 * author mjk
 * since 160405
 * practice for decorator pattern
 * I make the decorator pattern with system of making custom phone case
 */

package com.j2.w5;

public abstract class Phonecase{
  public String description = "nothing";
  
  public String getDescription(){
    return description;
  }
  
  public abstract int cost();
}


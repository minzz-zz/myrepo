/* 
 * @author mjk
 * @since 160404
 */

package com.j2.w5;

public abstract class Beverage{
  String description = "Unknown Beverage";
  
  public String getDescription() {
    return description;
  }
  
  public abstract double cost();
}
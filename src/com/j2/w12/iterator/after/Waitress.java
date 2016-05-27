package com.j2.w12.iterator.after;


public class Waitress{
  CafeMenu cm;
  DinerMenu dm;
  public Waitress(CafeMenu c, DinerMenu d){
    this.cm = c;
    this.dm = d;
  }
  public void printMenu(Iterator iterator){
    while (iterator.hasNext()){
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.println(menuItem.getName());
    }
  }
}
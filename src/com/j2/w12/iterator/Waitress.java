package com.j2.w12.iterator;


public class Waitress{
  PancakeHouseMenu phm;
  DinerMenu dm;
  public Waitress(PancakeHouseMenu p, DinerMenu d){
    this.phm = p;
    this.dm = d;
  }
  public void printMenu(Iterator iterator){
    while (iterator.hasNext()){
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.println(menuItem.getName());
    }
  }
}
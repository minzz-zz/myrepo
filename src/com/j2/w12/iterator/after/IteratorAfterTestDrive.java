package com.j2.w12.iterator.after;


public class IteratorAfterTestDrive{
  public static void main(String [] args){
    CafeMenu cm = new CafeMenu();
    DinerMenu dm = new DinerMenu();
    Waitress waitress = new Waitress(cm, dm);
    Iterator ci = cm.createIterator();
    waitress.printMenu(ci);
    System.out.println();
    Iterator di = dm.createIterator();
    waitress.printMenu(di);
  }
}
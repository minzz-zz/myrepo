package com.j2.w12.iterator;


public class IteratorTestDrive{
  public static void main(String [] args){
    PancakeHouseMenu phm = new PancakeHouseMenu();
    DinerMenu dm = new DinerMenu();
    Waitress waitress = new Waitress(phm, dm);
    Iterator pi = phm.createIterator();
    waitress.printMenu(pi);
    System.out.println();
    Iterator di = dm.createIterator();
    waitress.printMenu(di);
  }
}
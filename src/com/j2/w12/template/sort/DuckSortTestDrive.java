package com.j2.w12.template.sort;

import java.util.Arrays;

public class DuckSortTestDrive{
  public static void main(String[] args){
    Duck[] ducks = {new Duck("Duck1", 10),
    new Duck("Duck2", 1),
    new Duck("Duck3", 5),
    new Duck("Duck4", 3),
    new Duck("Duck5", 14)};
    Arrays.sort(ducks);
    for (int i=0; i<ducks.length; i++){
      System.out.println(ducks[i].name + " " +ducks[i].weight);
    }
    
    Duck[] myDucks = {new Duck("Sang", 8),
    new Duck("Myung", 2),
    new Duck("Univ", 7)};
    Arrays.sort(myDucks, new DuckComparator());
    for (int i=0; i<myDucks.length; i++){
      System.out.println(myDucks[i].name + " " +myDucks[i].weight);
    }
  }
}
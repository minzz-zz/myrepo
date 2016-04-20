package com.j2.w7.singleton;

public class Singleton {
  //private static Singleton uniqueInstance; # solution 1
  private static Singleton uniqueInstance;
  //private static Singleton uniqueInstance=new Singleton(); # solution 2
  static int numCalled=0;
  private Singleton() {}
  public static synchronized Singleton getInstance() { //synchronized add to # solution 2
    //if(uniqueInstance==null){
    //  uniqueInstance=new Singleton();
    //}  to solve thread # solution 1
    if(uniqueInstance==null){
      uniqueInstance=new Singleton();
    }
    numCalled++;
    System.out.println("numCalled: "+ numCalled);
    return uniqueInstance;
  }
}
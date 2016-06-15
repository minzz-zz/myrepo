package com.j2.forTest.adapter;


public class AdapterTestDrive{
  public static void main(String [] args){
    Duck md = new MallardDuck();
    DuckAdapter da = new DuckAdapter(md);
    da.gobble();
    da.fly();
  }
}
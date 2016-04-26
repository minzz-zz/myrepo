package com.j2.forTest.factory.s;



public class PizzaTestDriver{
  public static void main(String[] args){
    PizzaFactory factory = new PizzaFactory();
    PizzaStore store = new PizzaStore(factory);
    Pizza pizza = store.orderPizza("cheese");
  }
}
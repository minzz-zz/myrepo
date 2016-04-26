package com.j2.forTest.factory.s;


public class PizzaFactory{
  public Pizza createPizza(String type){
    Pizza pizza=null;
    if (type.equals("cheese")){
      pizza = new CheesePizza();
    }
    return pizza;
  }
}
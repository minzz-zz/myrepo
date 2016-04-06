package com.j2.w6;

public class SimplePizzaFactory{
  public Pizza createPizza(String type) {
    Pizza pizza=null;
    if(type=="cheese"){
      pizza=new CheesePizza();
    } //type.equals("cheese")
    else if(type.equals("veggie")){
      pizza=new VeggiePizza();
    }
    return pizza;
  }
}
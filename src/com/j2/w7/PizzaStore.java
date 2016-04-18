package com.j2.w7;

/*public class PizzaStore {
  SimplePizzaFactory factory;
  public PizzaStore(SimplePizzaFactory factory) {
    this.factory=factory;
  }
  public Pizza orderPizza(String type) {
    Pizza pizza=factory.createPizza(type);
    pizza.prepare();
  }
}*/
public abstract class PizzaStore {
  protected abstract Pizza createPizza(String type);
  public Pizza orderPizza(String type) {
    Pizza pizza=createPizza(type);
    System.out.println("----making " + type + "----");
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
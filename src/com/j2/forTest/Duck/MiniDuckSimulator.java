package com.j2.forTest.Duck;

public class MiniDuckSimulator{
  public static void main(String[] args){
    Duck duck1 = new MallardDuck();
    duck1.performQuack();
    duck1.performFly();
    Duck duck2 = new ModelDuck();
    duck2.performQuack();
    duck2.performFly();
    System.out.println("Model Duck get Electric Wings!");
    duck2.setFlyBehavior(new FlyWithWings());
    duck2.performFly();
  }
}
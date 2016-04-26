/* 
 * exercising for MidTerm
 * chapter 1. strategy
 * strategy pattern: 행동을 정의하는 클래스를 생성하여 그것을 캡슐화 하는 것.
 * 새로운 기능이 추가 되어도 전체 코드가 아닌 일부 코드만을 수정해도 된다.
 */

package com.j2.forTest.Duck;


public abstract class Duck{
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  
  public Duck(){}
  
  void setFlyBehavior(FlyBehavior f){
    flyBehavior=f;
  }
  
  void setQuackBehavior(QuackBehavior q){
    quackBehavior=q;
  }
  
  abstract void display();
  
  public void performFly(){
    flyBehavior.fly();
  }
  
  public void performQuack(){
    quackBehavior.quack();
  }
  
  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
}
/* 
 * exercising for MidTerm
 * chapter 1. strategy
 * strategy pattern: �ൿ�� �����ϴ� Ŭ������ �����Ͽ� �װ��� ĸ��ȭ �ϴ� ��.
 * ���ο� ����� �߰� �Ǿ ��ü �ڵ尡 �ƴ� �Ϻ� �ڵ常�� �����ص� �ȴ�.
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
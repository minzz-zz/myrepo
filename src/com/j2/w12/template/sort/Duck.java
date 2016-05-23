package com.j2.w12.template.sort;


public class Duck implements Comparable{
  String name;
  int weight;
  public Duck(String name, int weight){
    this.name = name;
    this.weight = weight;
  }
  public int compareTo(Object o){
    Duck otherDuck = (Duck)o;
    int result = 0;
    if (this.weight<otherDuck.weight){
      result = -1;
    }else if(this.weight == otherDuck.weight){
      result = 0;
    }else{
      result = 1;
    }
    return result;
  }
}
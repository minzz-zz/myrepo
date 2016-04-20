package com.j2.w7.singleton;

public class SingletonsMain{
  public static void main(String []args){
    Singleton s1=Singleton.getInstance();
    Singleton s2=Singleton.getInstance();
    Singleton s3=Singleton.getInstance();
  }
}
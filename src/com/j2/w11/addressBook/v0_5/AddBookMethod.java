package com.j2.w11.addressBook.v0_5;

import java.util.ArrayList;
public class AddBookMethod{
  String name;
  String tel;
  Object tmp;
  ArrayList<Object> pb = new ArrayList<Object>();
  public AddBookMethod(String name, String tel){
    this.name = name;
    this.tel = tel;
  }
  public void add(Object o){
    pb.add(o);
  }
  public void removeN(String name){
    for (int i=0; i<pb.size(); i++){
      if (pb.get(i).name == name){
        for (int j=pb.size()-1; j>i; j--){
          tmp=pb(j);
          pb(j)=pb(j+1);
          pb(j+1)=tmp;
        }
      }
      else{
        System.out.println("Can't find " + name);
      }
    }
  }
  public void removeT(String tel){
    for (int i=0; i<pb.size(); i++){
      if (pb[i].tel == tel){
        for (int j=pb.size()-1; j>i; j--){
          tmp=pb[j];
          pb[j]=pb[j+1];
          pb[j+1]=tmp;
        }
      }
      else{
        System.out.println("Can't find " + tel);
      }
    }
  }
  
  public void searchN(String name){
    for (int i=0; i<pb.size(); i++){
      if (pb[i].name == name){
        System.out.println(pb[i]);
      }
      else{
        System.out.println("Can't find " + name);
      }
    }
  }
  public void searchT(String tel){
    for (int i=0; i<pb.size(); i++){
      if (pb[i].tel == tel){
        System.out.println(pb[i]);
      }
      else{
        System.out.println("Can't find " + tel);
      }
    }
  }
  
  public void printAll(){
    for (int i=0; i<pb.size(); i++){
      System.out.println(pb[i]);
    }
  }
}
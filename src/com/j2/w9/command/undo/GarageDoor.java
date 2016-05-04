package com.j2.w9.command.undo;



public class GarageDoor{
  int level;
  public GarageDoor(){}
  public void open(){
    System.out.println("Door open!");
  }
  public void close(){
    System.out.println("Door close!");
  }
  public void dim(int level){
    this.level=level;
    if (level==0){
      close();
    }
    else if (level==100){
      open();
    }
    else{
      System.out.println("Door open: " + level + "%");
    }
  }
}
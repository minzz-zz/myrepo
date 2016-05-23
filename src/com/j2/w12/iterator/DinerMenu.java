package com.j2.w12.iterator;


import java.util.Arrays;

public class DinerMenu{
  static final int MAX_ITEMS = 3;
  int numberOfItems=0;
  MenuItem[] menuItems;
  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("BLT", "...", true, 2.9);
    addItem("PIZZA", "...", false, 5.1);
    addItem("SPAGETTI", "...", false, 3.2);
  }
  public void addItem(String name, String description, boolean v, double p){
    MenuItem menuItem = new MenuItem(name, description, v, p);
    if (numberOfItems>MAX_ITEMS) {
      System.out.println("Error");
    }else{
      menuItems[0] = menuItem;
      numberOfItems = numberOfItems + 1;
    }
    //menuItems[0] = menuItem; 이렇게 하면 안됌! 어레이가 생성되지 않았음.
  }
}
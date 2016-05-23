package com.j2.w12.iterator;


import java.util.ArrayList;

public class PancakeHouseMenu{
  //static final int MAX_ITEMS = 3;
  //int numberOfItems=0;
  //MenuItem[] menuItems;
  ArrayList menuItems;
  public PancakeHouseMenu() {
    //menuItem = new MenuItem[MAX_ITEMS];
    menuItems = new ArrayList();
    addItem("BLT", "...", true, 2.9);
    addItem("PIZZA", "...", false, 5.1);
    addItem("SPAGETTI", "...", false, 3.2);
  }
  public void addItem(String name, String description, boolean v, double p){
    MenuItem menuItem = new MenuItem(name, description, v, p);
    //if (numberOfItems>MAX_ITEMS) {
    //  System.out.println("Error");
    //}else{
    //  menuItems[0] = menuItem;
    //  numberOfItems = numberOfItems + 1;
    //}
    menuItems.add(menuItem);
  }
}
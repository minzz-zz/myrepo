package com.j2.w12.iterator;


import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
  //static final int MAX_ITEMS = 3;
  //int numberOfItems=0;
  //MenuItem[] menuItems;
  ArrayList menuItems;
  public PancakeHouseMenu() {
    //menuItem = new MenuItem[MAX_ITEMS];
    menuItems = new ArrayList();
    addItem("PLAIN", "...", true, 2.9);
    addItem("WithHoney", "...", false, 5.1);
    addItem("WithButter", "...", false, 3.2);
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
  public Iterator createIterator(){
    return new PancakeHouseMenuIterator(menuItems);
  }
}
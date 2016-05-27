package com.j2.w12.iterator.after;


import java.util.ArrayList;

public class CafeMenu implements Menu{
  ArrayList menuItems;
  public CafeMenu() {
    menuItems = new ArrayList();
    addItem("아메리카노", "13oz, 2샷", true, 3800);
    addItem("카페모카", "13oz, 2샷, 우유, 초코파우더", false, 4500);
    addItem("자몽에이드", "자몽청, 탄산수", true, 3500);
  }
  public void addItem(String name, String description, boolean v, double p){
    MenuItem menuItem = new MenuItem(name, description, v, p);
    menuItems.add(menuItem);
  }
  public Iterator createIterator(){
    return new CafeMenuIterator(menuItems);
  }
}
package com.j2.w12.iterator.after;


import java.util.ArrayList;

public class CafeMenu implements Menu{
  ArrayList menuItems;
  public CafeMenu() {
    menuItems = new ArrayList();
    addItem("�Ƹ޸�ī��", "13oz, 2��", true, 3800);
    addItem("ī���ī", "13oz, 2��, ����, �����Ŀ��", false, 4500);
    addItem("�ڸ����̵�", "�ڸ�û, ź���", true, 3500);
  }
  public void addItem(String name, String description, boolean v, double p){
    MenuItem menuItem = new MenuItem(name, description, v, p);
    menuItems.add(menuItem);
  }
  public Iterator createIterator(){
    return new CafeMenuIterator(menuItems);
  }
}
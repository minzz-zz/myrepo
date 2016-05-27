package com.j2.w12.iterator.after;


public class DinerMenu implements Menu{
  static final int MAX_ITEMS = 3;
  int numberOfItems=0;
  MenuItem[] menuItems;
  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("�����", "���� ����, ��ä�� ���� ���", true, 8000);
    addItem("������", "������⸦ �ְ� ���� ����", false, 6000);
    addItem("���� ����", "���Ӱ��, ��ġ ������ �̷���� 1�� ����", false, 11000);
  }
  public void addItem(String name, String description, boolean v, double p){
    MenuItem menuItem = new MenuItem(name, description, v, p);
    if (numberOfItems>MAX_ITEMS) {
      System.out.println("Error");
    }else{
      menuItems[0] = menuItem;
      numberOfItems = numberOfItems + 1;
    }
  }
  public Iterator createIterator(){
    return new DinerIterator(menuItems);
  }
}
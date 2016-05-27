package com.j2.w12.iterator.after;


public class DinerMenu implements Menu{
  static final int MAX_ITEMS = 3;
  int numberOfItems=0;
  MenuItem[] menuItems;
  public DinerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("ºñºö¹ä", "°¢Á¾ ³ª¹°, ¾ßÃ¤¿Í ¹äÀ» ºñºö", true, 8000);
    addItem("°¨ÀÚÅÁ", "µÅÁö°í±â¸¦ ³Ö°í ²úÀÎ ÅÁ·ù", false, 6000);
    addItem("º¸½Ó Á¤½Ä", "º¸½Ó°í±â, ±èÄ¡ µîÀ¸·Î ÀÌ·ç¾îÁø 1ÀÎ Á¤½Ä", false, 11000);
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
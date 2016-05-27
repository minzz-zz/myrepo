package com.j2.w12.iterator.after;


public class DinerIterator implements Iterator{
  MenuItem[] items;
  int position=0;
  public DinerIterator(MenuItem[] items){
    this.items = items;
  }
  public boolean hasNext(){
    if (position >= items.length || items[position]==null) {
      return false;
    }else{
      return true;
    }
  }
  
  public Object next(){
    MenuItem menuItem = items[position];
    position = position+1;
    return menuItem;
  }
}
package com.j2.w12.iterator.after;

import java.util.ArrayList;

public class CafeMenuIterator implements Iterator{
  ArrayList items;
  int position = 0;
  public CafeMenuIterator(ArrayList items){
    this.items = items;
  }
  public Object next(){
    Object object = (Object) items.get(position);
    position = position+1;
    return object;
  }
  public boolean hasNext(){
    if (position >= items.size()) {
      return false;
    }else{
      return true;
    }
  }
}
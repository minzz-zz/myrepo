package com.j2.forFinal.adapter;

import java.util.*;

public class IteratorAdapter implements Enumeration{
  Iterator iterator;
  public IteratorAdapter(Iterator iterator){
    this.iterator = iterator;
  }
  public boolean hasMoreElements(){
    return iterator.hasNext();
  }
  public Object nextElement(){
    return iterator.next();
  }
}
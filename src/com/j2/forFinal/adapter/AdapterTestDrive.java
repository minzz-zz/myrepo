package com.j2.forFinal.adapter;

import java.util.*;

public class AdapterTestDrive{
  public static void main(String [] args){
    ArrayList list = new ArrayList(Arrays.asList(args));
    Enumeration enumeration = new IteratorAdapter(list.iterator());
    while(enumeration.hasMoreElements()){
      System.out.println(enumeration.nextElement());
    }
  }
}
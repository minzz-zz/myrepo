package com.j2.w10.adapter;

import java.util.*;

public class IteratorTestDrive {
  public static void main (String [] args){
    ArrayList l = new ArrayList(Arrays.asList(args));
    Enumeration enumeration = new IteratorEnumeration(l.iterator());
    while (enumeration.hasMoreElements()){
      System.out.println(enumeration.nextElement());
    }
  }
}
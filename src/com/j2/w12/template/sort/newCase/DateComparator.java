package com.j2.w12.template.sort.newCase;


import java.util.Comparator;
import java.util.Date;

public class DateComparator implements Comparator{
  public int compare(Object o1, Object o2){
    Date date1 = (Date) o1;
    Date date2 = (Date) o2;
    return date1.compareTo(date2);
  }
}
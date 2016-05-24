package com.j2.w12.template.sort.newCase;


import java.util.Arrays;
import java.util.Date;

public class DateSortTestDrive{
  public static void main(String[] args){
    Date[] myDate = {new Date(1996, 1, 25),
      new Date(2012, 03, 21), 
      new Date(1996, 03, 21),
      new Date(2016, 05, 24),
      new Date(2015, 04, 01)};
    Arrays.sort(myDate, new DateComparator());
    for (int i=0; i<myDate.length; i++){
      System.out.println(myDate[i].getYear() + "/" + myDate[i].getMonth() + "/" + myDate[i].getDate());
    }
  }
}
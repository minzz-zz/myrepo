package com.j2.w3;

public class SorterMainV2{
  public static void main(String[]args) {
    String[] b={"John", "Adam", "Skrien", "Smith", "Jones"};
    Comparator stringComp = new StringComparator();
    Sorter.sort(b,stringComp);
    Integer[] c={new Integer(3), new Integer(1), new Integer(4), new Integer(2)}; 
    Comparator integerComp = new integerComparator();
    Sorter.sort(c,integerComp);
    for (int i=0;i<b.length;i++)
      System.out.println("b["+i+"]="+b[i]);
    for (int i=0;i<c.length;i++)
      System.out.println("c["+i+"]="+c[i]);
  }
}

class Sorter{
  public Sorter(){}
  public static void sort(Object[] data, Comparator comp){
    for(int i=data.length-1;i>=1;i--){
      int indexOfMax=0;
      for (int j=1;j<=i;j++){
        if (comp.compare(data[j], data[indexOfMax])>0)
          indexOfMax=1;
      }
      Object temp=data[i];
      data[i]=data[indexOfMax];
      data[indexOfMax]=temp;
    }
  }
}

interface Comparator{
  public int compare(Object o1, Object o2);
  public boolean equals(Object o);
}

class integerComparator implements Comparator {
  public int compare(Object o1, Object o2){
    return (Integer)o1-(Integer)o2;
  }
  public boolean equals(Object o){};
}

class StringComparator implements Comparator {
  public int compare(Object o1, Object o2){
    return ((String)o1).compareTo((String)o2);
  };
  public boolean equals(Object o);
}
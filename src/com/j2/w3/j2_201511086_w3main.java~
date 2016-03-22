package com.j2.w3;
import java.util.Date;
import com.sd.turtle.WeightTurtle;

public class j2_201511086_w3main {
    public static void main(String[] args) {
        String[] B={"John", "Adam", "Skrien", "Smith", "Jones"};
        Comparator stringComp=new StringComparator();
        Sorter.sort(B, stringComp);

        Integer[] C = {new Integer(3), new Integer(1), new Integer(4), new Integer(2)};
        Comparator integerComp=new IntegerComparator();
        Sorter.sort(C, integerComp);

        for(int i=0; i<B.length; i++)
            System.out.println("B["+i+"]="+B[i]);
        for(int i=0; i<C.length; i++)
            System.out.println("C["+i+"]="+C[i]);
        
        WeightTurtle t1 = new WeightTurtle(40);
        WeightTurtle t2 = new WeightTurtle(30);
        WeightTurtle t3 = new WeightTurtle(50);
        WeightTurtle[] wt={t1, t2, t3};
        Comparator turtleComp=new TurtleComparator();
        Sorter.sort(wt, turtleComp);
        
        for (int i=0;i<wt.length;i++)
          System.out.println("wt["+i+"]="+wt[i].getWeight());
        
        Date d1 = new Date("Wed, 01 Apr 2015");
        Date d2 = new Date("Fri, 01 Apr 2016");
        Date d3 = new Date("Mon, 21 Mar 2016");
        Date[] dt={d1, d2, d3};
        Comparator dateComp=new DateComparator();
        Sorter.sort(dt, dateComp);
        
        for (int i=0;i<dt.length;i++)
          System.out.println("dt["+i+"]="+dt[i].toString());
    }
}

class Sorter {
  public Sorter() {}
    public static void sort(Object[] data, Comparator comp) {
        for(int i=data.length-1; i>=1; i--) {
            int indexOfMax=0;
            for(int j=1; j<=i; j++) {
                if(comp.compare(data[j], data[indexOfMax]) > 0)
                    indexOfMax=j;
                }
                Object temp=data[i];
                data[i]=data[indexOfMax];
                data[indexOfMax]=temp;
        }
    }
}

interface Comparator {
    public int compare(Object o1, Object o2);
    public boolean equals(Object o);
}

class IntegerComparator implements Comparator {
    public IntegerComparator() {}
    public int compare(Object o1, Object o2) {
        return (Integer)o1 - (Integer)o2;
    }
}

class StringComparator implements Comparator {
    public StringComparator() {}
    public int compare(Object o1, Object o2) {
        String s1=(String)o1;  //compulsory type changing
        String s2=(String)o2;
        return s1.compareTo(s2);
    }
}

class DateComparator implements Comparator {
    public DateComparator() {}
    public int compare(Object o1, Object o2) {
      return ((Date) o1).compareTo((Date) o2);
    }
}


class TurtleComparator implements Comparator {
    public int compare(Object t1, Object t2) {
        return ((WeightTurtle)t1).getWeight()-((WeightTurtle)t2).getWeight();
        
       //make compare similar with compareTo, compareTo return int value.
       //if a>b than, a.compareTo(b) return the value that is larger than zero.
       //if a<b than, a.compareTo(b) return the value that is smaller than zero.
       //if a=b than, a.compareTo(b) return the value that is zero.
    }
}
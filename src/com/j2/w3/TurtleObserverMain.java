package com.j2.w3;

import ch.aplu.turtle.*;
import java.awt.Color;
import java.util.ArrayList;
import java.awt.geom.Point2D.Double;
import java.util.Observer;
import java.util.Observable;

public class TurtleObserverMain {
  public static void main(String[] args){
    BabyTurtle baby = new BabyTurtle();
    MomTurtle mom = new MomTurtle();
    MomTurtle dad = new MomTurtle();
    MomTurtle teacher = new MomTurtle();
    mom.setColor(Color.red);
    dad.setColor(Color.blue);
    teacher.setColor(Color.yellow);
    baby.addObserver(dad);
    baby.addObserver(teacher);
    baby.addObserver(mom);
    mom.moveTo(100,100);
    dad.moveTo(-100,-100);
    teacher.moveTo(-150,200);
    baby.move(100,-100);
    baby.setChanged();
    baby.notifyObservers();
  }
}

class MomTurtle extends Turtle implements Observer{
  Double babyCurpos;
  public void update(Observable o, Object arg){
    System.out.println("update() called, count is "+((Integer)arg).intValue());
    babyCurpos=((BabyTurtle)o).myCurpos;
    System.out.println("current pos" + babyCurpos);
    moveTo(babyCurpos);
  }
}

class BabyTurtle extends Observable{ //can't Multiple, so can't extend Turtle
  Turtle baby;  //연관관계로 받아옴 
  Double myCurpos;
  ArrayList<Observer> obs;
  public BabyTurtle() {
    baby = new Turtle();
    myCurpos=baby.getPos();  //getPos = get location
    obs=new ArrayList<Observer>();  //Array has limit, but ArrayList doesn't
  }
  public void addObserver(Observer o){
    obs.add(o);
  }
  protected void setChanged() {
    myCurpos=baby.getPos();
  }
  public void notifyObservers(){
    for (Observer o:obs)  // for(Obs type)
      o.update(this, 1);
  }
  public void move(int x, int y) {
   baby.moveTo(x,y);
  }
}
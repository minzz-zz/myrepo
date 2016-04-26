package com.j2.forTest.observer;

import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import java.awt.geom.Point2D.Double;
import java.awt.Color;
import ch.aplu.turtle.*;

public class MomTurtle extends Turtle implements Observer{
  Double babyCurPos;
  public MomTurtle(){
    setColor(Color.red);
    label("Mom turtle");
  }
  public void update(Observable o, Object arg){
    babyCurPos=((BabyTurtle)o).myCurPos;
    System.out.println("current pos "+babyCurPos);
    moveTo(babyCurPos);
  }
}
package com.j2.w4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.util.Observer;
import java.util.Observable;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D;

class TurtleMouseListener extends Turtle {
  public TurtleMouseListener() {
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        Point2D.Double p;
        //p=(Point2D.Double)e.getPoint();
        p=toTurtlePos(e.getPoint());  // toTurtlePos func is the func that turtle func use
        double d=distance(p);
        double w=towards(p);
        heading(w);
        forward(d);
        setStatusText("moving to "+p.toString());
      }
  });
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        Point2D.Double p;
        //p=(Point2D.Double)e.getPoint();
        p=toTurtlePos(e.getPoint());
        moveTo(p);
        setStatusText("dragging to "+p.toString());
      }
    });
  }
}

public class TurtleMouseObserverMain{
  public static void main(String[] args){
    TurtleMouseListener t = new TurtleMouseListener();
    t.addStatusBar(20);
    t.setStatusText("click or drag");
  }
}
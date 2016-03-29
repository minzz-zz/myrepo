package com.j2.w4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D;

public class j2_201511086_w4_mouse extends Turtle {
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
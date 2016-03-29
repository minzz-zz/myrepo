package com.j2.w4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D;

public class j2_201511086_w4main_mouse{
  public static void main(String[] args){
    TurtleMouseListener t = new TurtleMouseListener();
    t.addStatusBar(20);
    t.setStatusText("click or drag");
  }
}
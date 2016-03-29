package com.j2.w4;

import ch.aplu.turtle.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class j2_201511086_w4main{
  public static void main(String[] args){
    TurtleKeyListener t = new TurtleKeyListener();
    t.addStatusBar(20);
    t.setStatusText("Press any key!");
  }
}
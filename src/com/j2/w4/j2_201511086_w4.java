package com.j2.w4;

import ch.aplu.turtle.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class j2_201511086_w4 extends Turtle {
  public TurtleKeyListener() {
    addKeyListener(new KeyAdapter() {
    public void KeyPressed(KeyEvent e){
    int keyCode=e.getKeyCode();  //ASCII value in keyCode
    System.out.println(keyCode);
    switch(keyCode) {
      case KeyEvent.VK_UP:
        setStatusText("forward 20");
        forward(20);
        System.out.println("input : up-key");
        break;
      case KeyEvent.VK_DOWN:
        setStatusText("back 20");
        back(20);
        System.out.println("input : down-key");
        break;
      case KeyEvent.VK_RIGHT:
        setStatusText("turn right");
        right(90);
        System.out.println("input : right-key");
        break;
      case KeyEvent.VK_LEFT:
        setStatusText("turn left");
        left(90);
        System.out.println("input : left-key");
        break;
      case KeyEvent.VK_Q:
        setStatusText("q pressed and exiting");
        System.out.println("input : q-key");
        break;
      case KeyEvent.VK_W:
        setStatusText("forward 20");
        forward(20);
        break;
      case KeyEvent.VK_A:
        setStatusText("turn left");
        left(90);
        break;
      case KeyEvent.VK_S:
        setStatusText("back 20");
        back(20);
        break;
      case KeyEvent.VK_D:
        setStatusText("turn right");
        right(90);
        break;
    }
  }
    });
  }
}
package com.j2.w4;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Observer;
import java.util.Observable;
import ch.aplu.turtle.*;

class TurtleKeyListener extends Turtle {
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
    }
  }
    });
  }
}

public class TurtleObserverMain{
  public static void main(String[] args){
    TurtleKeyListener t = new TurtleKeyListener();
    t.addStatusBar(20);
    t.setStatusText("Press any key!");
  }
}
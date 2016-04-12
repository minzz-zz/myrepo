/* 
 * author mjk
 * since 20160413
 */

package com.j2.w6.Calc;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D;

public class makeCalcForm extends Turtle{
  public makeCalcForm(){
    Turtle num1 = new Turtle();
    num1.addStatusBar(20);
    num1.setPos(-150, 150);
    num1.label("1");
    Turtle num2 = new Turtle(num1);
    num2.setPos(-50, 150);
    num2.label("2");
    Turtle num3 = new Turtle(num1);
    num3.setPos(50, 150);
    num3.label("3");
    Turtle plus = new Turtle(num1);
    plus.setPos(150,150);
    plus.label("+");
    Turtle num4 = new Turtle(num1);
    num4.setPos(-150,50);
    num4.label("4");
    Turtle num5 = new Turtle(num1);
    num5.setPos(-50,50);
    num5.label("5");
    Turtle num6 = new Turtle(num1);
    num6.setPos(50,50);
    num6.label("6");
    Turtle minus = new Turtle(num1);
    minus.setPos(150,50);
    minus.label("-");
    Turtle num7 = new Turtle(num1);
    num7.setPos(-150,-50);
    num7.label("7");
    Turtle num8 = new Turtle(num1);
    num8.setPos(-50, -50);
    num8.label("8");
    Turtle num9 = new Turtle(num1);
    num9.setPos(50,-50);
    num9.label("9");
    Turtle multi = new Turtle(num1);
    multi.setPos(150,-50);
    multi.label("*");
    Turtle div = new Turtle(num1);
    div.setPos(150, -150);
    div.label("/");
    Turtle sol = new Turtle(num1);
    sol.setPos(50, -150);
    sol.label("=");
  }
}
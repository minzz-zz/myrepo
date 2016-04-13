/* 
 * author mjk
 * since 20160413
 */

package com.j2.w6.Calc;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import ch.aplu.turtle.*;
import java.util.ArrayList;

public class TurtleMouseListener_Calc extends Turtle {
  public TurtleMouseListener_Calc() {
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
    addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        int x, y;
        ArrayList<String> resultStr = new ArrayList<String>();
        x=e.getX();
        y=e.getY();
        boolean inFirstRow=(y>0 && y<100);
        boolean inSecondRow=(y>100 && y<200);
        boolean inThirdRow=(y>200 && y<300);
        boolean inFourthRow=(y>300 && y<400);
        boolean inFirstCol=(x>0 && x<100);
        boolean inSecondCol=(x>100 && x<200);
        boolean inThirdCol=(x>200 && x<300);
        boolean inFourthCol=(x>300 && x<400);
        if (inFirstRow && inFirstCol){
          setStatusText("1");
          resultStr.add("1");
        }
        else if (inFirstRow && inSecondCol){
          setStatusText("2");
          resultStr.add("2");
        }
        else if (inFirstRow && inThirdCol){
          setStatusText("3");
          resultStr.add("3");
        }
        else if (inSecondRow && inFirstCol){
          setStatusText("4");
          resultStr.add("4");
        }
        else if (inSecondRow && inSecondCol){
          setStatusText("5");
          resultStr.add("5");
        }
        else if (inSecondRow && inThirdCol){
          setStatusText("6");
          resultStr.add("6");
        }
        else if (inThirdRow && inFirstCol){
          setStatusText("7");
          resultStr.add("7");
        }
        else if (inThirdRow && inSecondCol){
          setStatusText("8");
          resultStr.add("8");
        }
        else if (inThirdRow && inThirdCol){
          setStatusText("9");
          resultStr.add("9");
        }
        else if (inFirstRow && inFourthCol){
          setStatusText("+");
          resultStr.add("+");
        }
        else if (inSecondRow && inFourthCol){
          setStatusText("-");
          resultStr.add("-");
        }
        else if (inThirdRow && inFourthCol){
          setStatusText("*");
          resultStr.add("*");
        }
        else if (inFourthRow && inFourthCol){
          setStatusText("/");
          resultStr.add("/");
        }
        else if (inThirdCol && inFourthRow){
          resultStr.add("=");
          String printResult =" ";
          for (int i=0; i<resultStr.size(); i++){
            printResult=printResult+resultStr.get(i);
          }
          setStatusText(printResult);
        }
        else{
          setStatusText("Please click again!");
        }
        }
      });
  }
}
package com.j2.w9.calc;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CalcActionListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
    JButton b = (JButton)e.getSource();
    if(b.getText().equals("1")){
      System.out.println("1");
    }
    else if (b.getText().equals("2")){
      System.out.println("2");
    }
    else if (b.getText().equals("3")){
      System.out.println("3");
    }
    else if (b.getText().equals("4")){
      System.out.println("4");
    }
    else if (b.getText().equals("5")){
      System.out.println("5");
    }
    else if (b.getText().equals("6")){
      System.out.println("6");
    }
    else if (b.getText().equals("7")){
      System.out.println("7");
    }
    else if (b.getText().equals("8")){
      System.out.println("8");
    }
    else if (b.getText().equals("9")){
      System.out.println("9");
    }
    else if (b.getText().equals("+")){
      System.out.println("+");
    }
    else if (b.getText().equals("-")){
      System.out.println("-");
    }
    else if (b.getText().equals("/")){
      System.out.println("/");
    }
    else if (b.getText().equals("*")){
      System.out.println("*");
    }
    else if (b.getText().equals("%")){
      System.out.println("%");
    }
    else if (b.getText().equals("=")){
      System.out.println("=");
    }
    
  }
}
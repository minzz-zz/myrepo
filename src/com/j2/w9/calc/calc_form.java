package com.j2.practice.swing;


import javax.swing.*;
import java.awt.*;


public class calc_form extends JFrame{
  calc_form(){
    setTitle("201511086 calc");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    CalcActionListener actionListener = new CalcActionListener();
    GridLayout form = new GridLayout(5,5,5,5);
    setLayout(form);
    JTextField value = new JTextField();
    value.setEditable(false);
    add(value);
    JButton button1 = new JButton("1");
    add(button1);
    JButton button2 = new JButton("2");
    add(button2);
    JButton button3 = new JButton("3");
    add(button3);
    JButton buttonP = new JButton("+");
    add(buttonP);
    JButton button4 = new JButton("4");
    add(button4);
    JButton button5 = new JButton("5");
    add(button5);
    JButton button6 = new JButton("6");
    add(button6);
    JButton buttonMin = new JButton("-");
    add(buttonMin);
    JButton button7 = new JButton("7");
    add(button7);
    JButton button8 = new JButton("8");
    add(button8);
    JButton button9 = new JButton("9");
    add(button9);
    JButton buttonMulti = new JButton("*");
    add(buttonMulti);
    JButton button0 = new JButton("0");
    add(button0);
    JButton button00 = new JButton("00");
    add(button00);
    JButton buttonDot = new JButton(".");
    add(buttonDot);
    JButton buttonD = new JButton("/");
    add(buttonD);
    JButton buttonV = new JButton("=");
    add(buttonV);
    JButton buttonDN = new JButton("%");
    add(buttonDN);
    JButton buttonR = new JButton("AC");
    add(buttonR);
    button1.addActionListener(actionListener);
    button2.addActionListener(actionListener);
    button3.addActionListener(actionListener);
    button4.addActionListener(actionListener);
    button5.addActionListener(actionListener);
    button6.addActionListener(actionListener);
    button7.addActionListener(actionListener);
    button8.addActionListener(actionListener);
    button9.addActionListener(actionListener);
    button0.addActionListener(actionListener);
    button00.addActionListener(actionListener);
    buttonP.addActionListener(actionListener);
    buttonMin.addActionListener(actionListener);
    buttonMulti.addActionListener(actionListener);
    buttonD.addActionListener(actionListener);
    buttonDN.addActionListener(actionListener);
    buttonDot.addActionListener(actionListener);
    buttonR.addActionListener(actionListener);
    buttonV.addActionListener(actionListener);
    
    setSize(300,300);
    setVisible(true);
  }
  
  public static void main(String [] args){
    new calc_form();
  }
}
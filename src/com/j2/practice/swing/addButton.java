package com.j2.practice.swing;


import javax.swing.*;
import java.awt.*;

public class addButton extends JFrame{
  addButton(){
    setTitle("버튼 달기");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우를 닫으면 프로그램이 종료 되도록 한다.
    
    Container contentPane = getContentPane();
    contentPane.setBackground(Color.gray);
    contentPane.setLayout(new FlowLayout());
    contentPane.add(new JButton("OK"));
    contentPane.add(new JButton("Cancel"));
    contentPane.add(new JButton("Ignore"));
    
    setSize(300,150);
    setVisible(true);
  }
  
  public static void main(String [] args){
    new addButton();
  }
}
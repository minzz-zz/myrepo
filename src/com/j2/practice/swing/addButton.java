package com.j2.practice.swing;


import javax.swing.*;
import java.awt.*;

public class addButton extends JFrame{
  addButton(){
    setTitle("��ư �ޱ�");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �����츦 ������ ���α׷��� ���� �ǵ��� �Ѵ�.
    
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
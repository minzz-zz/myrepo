package com.j2.w11.addressBook.v0_5;


import java.util.Scanner;
public class PbTestDrive{
  Scanner sc = new Scanner(System.in);
  System.out.println("Please press the button: ");
  System.out.println("1: add");
  System.out.println("2: delete");
  System.out.println("3: search");
  System.out.println("4: print all");
  System.out.println("5: end the process");
  int input = sc.nextInt();
  while(input != 5){
    if (input == 1){
      System.out.println("Please enter name that you want to add:");
      String name = sc.nextLine();
      System.out.println("Please enter tel that you want to add");
      String tel = sc.nextLine();
      Object o = name + tel;
      add(o);
    }
    else if (input == 2){
      System.out.println("1: delete by name");
      System.out.println("2: delete by tel");
      input2 = sc.nextInt();
      if (input2 == 1){
        System.out.println("Please enter name that you want to delete:");
        String name = sc.nextLine();
        removeN(name);
      }
      else if(input2 == 2){
        System.out.println("Please enter tel that you want to delete:");
        String tel = sc.nextLine();
        removeT(tel);
      }
    }
    else if(input == 3){
      System.out.println("1: search by name");
      System.out.println("2: search by tel");
      input3 = sc.nextInt();
      if (input3 == 1){
        System.out.println("Please enter name that you want to search by:");
        String name = sc.nextLine();
        searchN(name);
      }
      else if(input3 == 2){
        System.out.println("Please enter tel that you want to search by:");
        String tel = sc.nextLine();
        searchT(tel);
      }
    }
    else if(input == 4){
      printAll();
    }
  }
}
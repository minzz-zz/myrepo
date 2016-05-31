package com.j2.w13.addressV1;


import java.util.Scanner;

public class addressBook{
  public Scanner sc = new Scanner(System.in);
  public addressInfo[] infoSet;
  public addressBook(addressInfo[] infoSet){
    this.infoSet = infoSet;
  }
  public int i = 0;
  String inputU = "0";
  public String name;
  public String num;
  public String startProcess(){
    System.out.println("�˸��� ��ư�� �����ּ���.");
    System.out.println("1: ���");
    System.out.println("2: ����");
    System.out.println("3: �˻�");
    System.out.println("4: ����");
    inputU = sc.nextLine();
    return inputU;
  }
  
  public void printInfo(addressInfo toP){
    System.out.println(toP.name + " : " + toP.num);
  }
  
  public void add(){
    System.out.println("�̸��� �Է��ϼ���:");
    name = sc.nextLine();
    System.out.println("�޴���ȭ ��ȣ�� �Է��ϼ���:");
    num = sc.nextLine();
    infoSet[i] = new addressInfo(name, num);
    i++;
    System.out.println("��� �Ϸ�!");
  }
  
  public void delete(){
    System.out.println("1: �̸����� ����");
    System.out.println("2: ��ȣ�� ����");
    String deleteInput = sc.nextLine();
    if (deleteInput == "1"){
      System.out.println("�̸��� �Է��ϼ���:");
      String deleteName = sc.nextLine();
      for (int j = 0; j<i; j++){
        if (deleteName.equals(infoSet[j].name)){
          infoSet[j].name = "";
          infoSet[j].num = "";
        }else{
          System.out.println("�ش� �̸��� ����� �����ϴ�.");
        }
      }
    }
    else if(deleteInput == "2"){
      System.out.println("�޴���ȭ ��ȣ�� �Է��ϼ���:");
      String deleteNum = sc.nextLine();
      for (int j = 0; j<i; j++){
        if (deleteNum.equals(infoSet[j].num)){
          infoSet[j].name = "";
          infoSet[j].num = "";
        }else{
          System.out.println("�ش� ��ȣ�� ����� �����ϴ�.");
        }
      }
    }
  }
  
  public void search(){
    System.out.println("1: �̸����� ã��");
    System.out.println("2: ��ȣ�� ã��");
    String searchInput = sc.nextLine();
    if (searchInput == "1"){
      System.out.println("�̸��� �Է��ϼ���:");
      String searchName = sc.nextLine();
      for (int j = 0; j<i; j++){
        if (searchName.equals(infoSet[j].name)){
          printInfo(infoSet[j]);
        }else{
          System.out.println("�ش� �̸��� ����� �����ϴ�.");
        }
      }
    }
    else if(searchInput == "2"){
      System.out.println("�޴���ȭ ��ȣ�� �Է��ϼ���:");
      String searchNum = sc.nextLine();
      for (int j = 0; j<i; j++){
        if (searchNum.equals(infoSet[j].num)){
          printInfo(infoSet[j]);
        }else{
          System.out.println("�ش� ��ȣ�� ����� �����ϴ�.");
        }
      }
    }
  }
}
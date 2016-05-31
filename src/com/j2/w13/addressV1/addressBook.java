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
    System.out.println("알맞은 버튼을 눌러주세요.");
    System.out.println("1: 등록");
    System.out.println("2: 삭제");
    System.out.println("3: 검색");
    System.out.println("4: 종료");
    inputU = sc.nextLine();
    return inputU;
  }
  
  public void printInfo(addressInfo toP){
    System.out.println(toP.name + " : " + toP.num);
  }
  
  public void add(){
    System.out.println("이름을 입력하세요:");
    name = sc.nextLine();
    System.out.println("휴대전화 번호를 입력하세요:");
    num = sc.nextLine();
    infoSet[i] = new addressInfo(name, num);
    i++;
    System.out.println("등록 완료!");
  }
  
  public void delete(){
    System.out.println("1: 이름으로 삭제");
    System.out.println("2: 번호로 삭제");
    String deleteInput = sc.nextLine();
    if (deleteInput == "1"){
      System.out.println("이름을 입력하세요:");
      String deleteName = sc.nextLine();
      for (int j = 0; j<i; j++){
        if (deleteName.equals(infoSet[j].name)){
          infoSet[j].name = "";
          infoSet[j].num = "";
        }else{
          System.out.println("해당 이름의 사람이 없습니다.");
        }
      }
    }
    else if(deleteInput == "2"){
      System.out.println("휴대전화 번호를 입력하세요:");
      String deleteNum = sc.nextLine();
      for (int j = 0; j<i; j++){
        if (deleteNum.equals(infoSet[j].num)){
          infoSet[j].name = "";
          infoSet[j].num = "";
        }else{
          System.out.println("해당 번호의 사람이 없습니다.");
        }
      }
    }
  }
  
  public void search(){
    System.out.println("1: 이름으로 찾기");
    System.out.println("2: 번호로 찾기");
    String searchInput = sc.nextLine();
    if (searchInput == "1"){
      System.out.println("이름을 입력하세요:");
      String searchName = sc.nextLine();
      for (int j = 0; j<i; j++){
        if (searchName.equals(infoSet[j].name)){
          printInfo(infoSet[j]);
        }else{
          System.out.println("해당 이름의 사람이 없습니다.");
        }
      }
    }
    else if(searchInput == "2"){
      System.out.println("휴대전화 번호를 입력하세요:");
      String searchNum = sc.nextLine();
      for (int j = 0; j<i; j++){
        if (searchNum.equals(infoSet[j].num)){
          printInfo(infoSet[j]);
        }else{
          System.out.println("해당 번호의 사람이 없습니다.");
        }
      }
    }
  }
}
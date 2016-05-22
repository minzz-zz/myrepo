package com.j2.w11.addressBook.v0_5;

import java.util.ArrayList;
public class AddressBook{
  private String name;
  private String tel; //private : can't directly access
  
  public AddressBook(String name, String tel){
    this.name = name;
    this.tel = tel;
  }
  public String toPrintF(){
    String forPrint = name + ":" + tel;
    return forPrint;
  }
  public String getName(){
    return name;
  }
  public String getTel(){
    return tel;
  }
}
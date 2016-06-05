package com.j2.w13.addressV1;


public class AddressTestDrive{
  public static void main(String [] args){
    addressInfo[] testBook = new addressInfo[100];
    addressBook forT = new addressBook(testBook);
    String inputU="1";
    while(inputU != "5"){
      inputU = forT.startProcess();
      switch(inputU){
        case "1":
          forT.add();
          break;
        case "2":
          forT.delete();
          break;
        case "3":
          forT.search();
          break;
        case "4":
          forT.print();
          break;
      }
    }
  }
}
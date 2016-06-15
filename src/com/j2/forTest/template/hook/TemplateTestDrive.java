package com.j2.forTest.template.hook;


public class TemplateTestDrive{
  public static void main(String [] args){
    Tea tea = new Tea();
    Coffee coffee = new Coffee();
    tea.prepareRecipe();
    coffee.prepareRecipe();
  }
}
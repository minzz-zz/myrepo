package com.j2.forFinal.template.hook;


public class TemplateTestDrive{
  public static void main(String [] args){
    Coffee coffee = new Coffee();
    Tea tea = new Tea();
    coffee.prepareRecipe();
    tea.prepareRecipe();
  }
}
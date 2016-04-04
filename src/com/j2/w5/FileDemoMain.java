/*
 * @author  mjk
 * @since 160404
 * demo how to use file decorator
 */

package com.j2.w5;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;;
import java.io.Reader;
import java.io.File;


public class FileDemoMain{
  public static void main(String[] args) throws Exception {
    File readme=null;
    FileInputStream isReadme=null;
    try{
      int i;
      char c;
      File myhome = new File(System.getProperty("user.home"));
      System.out.println("my home is "+myhome);
      
      String cwd = new File(".").getCanonicalPath();
      System.out.println("cwd is "+cwd);
      
      readme=new File(cwd, "hello.txt");
      System.out.println("readme is "+readme);
      
      isReadme = new FileInputStream(readme);
      while (((i=isReadme.read()) !=-1)) {
        c=(char)i;
        System.out.print(c);
      }
    }catch(Exception e) {
      e.printStackTrace();
      System.out.println("error");
    } finally {
      if(isReadme != null)
        isReadme.close();
    }  //finally는 catch에서 익셉션이 안나오고  try가 완벽하게 돌아가면 
  }
}
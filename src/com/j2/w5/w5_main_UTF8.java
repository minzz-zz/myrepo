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


public class w5_main_UTF8{
  public static void main(String[] args) throws Exception {
    File readme=null;
    FileInputStream isReadme=null;
    InputStreamReader isrReadme = null;
    BufferedReader brReadme = null;
    String str;
    try{
      File myhome = new File(System.getProperty("user.home"));
      System.out.println("my home directory is "+myhome);
      String cwd = new File(".").getCanonicalPath();
      System.out.println("cwd is "+cwd);
      readme=new File(cwd, "forTestUTF-8.txt");
      System.out.println("readme is "+readme);
      isReadme=new FileInputStream(readme);
      isrReadme=new InputStreamReader(isReadme,"UTF8");  // create inputStreamReader that uses the charset 'utf-8'
      brReadme= new BufferedReader(isrReadme);
      while((str=brReadme.readLine())!=null) {
          System.out.println(str);
      }
    }catch(Exception e){
        e.printStackTrace();
    }finally{
        if(brReadme != null)
            brReadme.close();  // if file has contents, than close the file and end the runnig.
    }
  }
}
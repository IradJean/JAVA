/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectone;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
/**
 *
 * @author Students
 */
public class tst {
    public static void main(String []args) {
    
  
        try{
            File myFile = new File("D:\\java\\myfile.doc");
      Scanner readMe = new Scanner(myFile);

//  FileReader filereader = new FileReader("D:\\java\\myfile.doc");
  
  while(readMe.hasNextLine()){
      String dt = readMe.nextLine();
  System.out.println(dt);
  }
  readMe.close();
  }catch(Exception e){
  System.out.println(e);
  }

    }
}
    
    


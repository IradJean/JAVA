
package projectone;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class QUestionSevenB {
    public static void main(String []args) {
        try{
  FileReader filereader = new FileReader("D:\\java\\myfile.doc");
  int i ;
  while((i = filereader.read()) != -1){
  System.out.println((char)i);
  filereader.close();
  }
  }catch(Exception e){
  System.out.println(e);
  }

    }
}

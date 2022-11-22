
package projectone;
import java.io.FileWriter;

public class QuestionSeven {
    public static void main(String []args){
    try{
    FileWriter fileWrite = new FileWriter("D:\\java\\myfile.doc");
    fileWrite.write("Hello Umunyana Honorine!");
    fileWrite.close();
    }catch(Exception error){
    System.out.println(error);
    }
    }
}

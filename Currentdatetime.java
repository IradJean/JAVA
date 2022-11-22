/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

package currentdatetime;


public class Currentdatetime {
    
    public static void main(String[] args) {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH/mm/ss");
        
    LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
    
}

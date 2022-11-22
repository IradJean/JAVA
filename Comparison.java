/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparison;

public class Comparison {

    public static void main(String[] args) {
   String x1= new String("Good");
   String x2= new String("GooD");

   //This outputs the comparison for Equal
    if((x1.equalsIgnoreCase(x2))){      
        System.out.println("Equal");
    }
    else{
        System.out.println("Not Equal");
    }
}
   /*   
 //This outputs the comparison for Not Equal
    if((x1.equals(x2))){      
        System.out   /* .println("Equal");
    }
    else{
        System.out.println("Not Equal");
    }
 */  
}
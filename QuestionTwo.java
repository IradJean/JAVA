
package projectone;
//demonstration of static polymorphism:
 class StaticPolymorphismTest{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int x, int y, int z){
        return x+y+z;
    }
    }

public class QuestionTwo {
    public static void main(String []args){
    
        StaticPolymorphismTest test = new StaticPolymorphismTest();
        // Static Polymorphism calls the values at compile time.
        System.out.println(test.add(45, 78));
         System.out.println(test.add(123, 54,322));
    }
    
}

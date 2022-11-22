//Demonstration of Dynamic Polymorphism
package projectone;
class ClassA{
public void display(){
System.out.println("ClassA");
}
            }
class ClassB extends ClassA{
        public void display(){
        System.out.println("ClassB");
        }
}

public class QuestionB {
    public static void main(String []args){
        ClassA obj = new ClassB(); //after instantiating an object of classB, 
        //on calling display() function, the program will determine which function call
        //at the run time
        obj.display();
    }
    
}

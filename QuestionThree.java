
package projectone;
abstract class myAbstractClass{
    abstract void Something(); // abstract methods must not contain body
    public void sayHello(){
    System.out.println("Hellooo There! I am from abstract class");
    }
}
class NormalClass extends myAbstractClass{
    void Something(){
    System.out.println("I am from Abstract class! however i am overriden from Normal class\n");
    }
}

public class QuestionThree {
    public static void main(String []args){
    myAbstractClass obj = new NormalClass();
//    myAbstractClass obj2 = new myAbstractClass(); abstract class can not be instantiated 
    obj.Something();
    obj.sayHello();
    }
    
}

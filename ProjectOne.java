
package projectone;
class A{    //Great Grand parent  class
int num = 10; 
  public  void sayClassA(){
    System.out.println("I am from class A\n");
    }
}
class B extends A{   // Grandpa Class
float num1 = 12.05f;
public void sayClassB(){
    System.out.println("I am from class B\n");
    }
}
class C extends B{
String name = "Charles"; // Parent Class
public void sayClassC(){
    System.out.println("I am from class C\n");
    }
}
class D extends C{ 
       double myNum = 19.849d;   
     public void sayClassD(){
    System.out.println("I am from class D\n");
    }//Child class
}

public class ProjectOne {

 
    public static void main(String[] args) {
        
       A a = new A();
       B b = new B();
       C c =  new C();
       D d = new D();
       d.sayClassD();
       d.sayClassC();
       d.sayClassA();
       d.sayClassB();
       System.out.println(d.name+" "+ d.num1+ " "+ d.myNum);
    } 
}

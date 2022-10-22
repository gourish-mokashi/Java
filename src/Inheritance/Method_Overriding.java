package Inheritance;
class Overriding_A{
    void meth(){
        System.out.println("I am in A");
    }
}
class Overriding_B extends Overriding_A{
    void meth(){
        System.out.println("I am in B");
    }
}
class Overriding_C extends Overriding_A{
    void meth(){
        System.out.println("I am in C");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
       Overriding_A a =new Overriding_A();
       a.meth();
       Overriding_A ab =new Overriding_B();
       ab.meth();
       Overriding_A ac =new Overriding_C();
       ac.meth();
    }
}

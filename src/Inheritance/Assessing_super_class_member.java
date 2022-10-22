package Inheritance;
class A{
    int a;
    A(){
        a=5;
    }
}
class B extends A{
    int a;
    B(){

        a=super.a*5;
    }
    void setB(){
        System.out.println("The Super class version of a is:"+super.a);
        System.out.println("The Sub class version of a is:"+a);

    }
}
public class Assessing_super_class_member {
    public static void main(String[] args) {
        B b=new B();
        b.setB();

    }
}

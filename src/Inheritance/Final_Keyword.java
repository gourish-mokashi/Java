package Inheritance;
class final_A{
    final int a=5;
    void meth(){
       // a=10;//not allowed
    }
    final void meth2(){
        System.out.println("I am a final method");
    }
}
class final_B extends final_A{
//    void meth2(){                     //error! cannot override a final method
//        System.out.println("I am in B");
//    }
}
final class c {
    void meth2() {
        System.out.println("I am in final class");
    }
}
    class d /*extends c*//* error!cannot inherit from a final class */ {
            void meth2(){
                System.out.println("I am in d class");
    }
}

public  class Final_Keyword {
    public static void main(String[] args) {

    }
}

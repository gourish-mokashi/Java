package Inheritance;
class X{
    X(){
        System.out.println("Inside X's Constructor");
    }
}
class Y extends X{
    Y(){
        System.out.println("Inside Y's Constructor");
    }
}
class Z extends X{  //used only in Hierarchical Inheritance
//class Z extends Y{  //used only in Multilevel inheritance
    Z(){
        System.out.println("Inside Z's Constructor");
    }
}
public class Order_of_Constructor_calling_in_Inheritance {
    public static void main(String[] args) {
        Z z =new Z();
    }
}

package Inheritance;
class super_class_Figure{
    double dimension1,dimension2;
    super_class_Figure(double d1,double d2){
        dimension1=d1;
        dimension2=d2;
    }
    double calculateArea(){
        return dimension1*dimension2;
    }
}
class super_class_Rectangle extends super_class_Figure{
    super_class_Rectangle(double l,double b){
        super(l,b);
    }
    void meth(){//We can't access the method in main
                //because of( super_class_Figure f=new super_class_Rectangle(3,4);) Which can only access super members of class super_class_Rectangle not methods.
        System.out.println("In method meth");
    }
}
public class Relation_between_a_Super_class_and_a_Subclass_Reference_Variable {
    public static void main(String[] args) {
        super_class_Figure f=new super_class_Rectangle(3,4);
        System.out.println("The area Rectangle:\n"+f.calculateArea());
    }
}

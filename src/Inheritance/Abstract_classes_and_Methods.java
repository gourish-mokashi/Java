package Inheritance;
abstract class abstract_Figure{
    double dimension1,dimension2;
    abstract_Figure(double d1,double d2){
        dimension1=d1;
        dimension2=d2;
    }
    abstract void calculateArea();
}
class abstract_Rectangle extends abstract_Figure{
    abstract_Rectangle(double l,double b){
        super(l,b);
    }
    void calculateArea(){
        System.out.println("The Area of rectangle:\n"+dimension1*dimension2);
    }
}
class abstract_Triangle extends abstract_Figure{
    abstract_Triangle(double base,double height){
        super(base,height);
    }
    void calculateArea(){
        double area=0.5*dimension1*dimension2;
        System.out.println("The Area Triangle is:\n"+area);
    }
}
public class Abstract_classes_and_Methods {
    public static void main(String[] args) {
        abstract_Figure f;
        f=new abstract_Rectangle(3,4);
        f.calculateArea();
        f=new abstract_Triangle(4,5);
        f.calculateArea();
    }
}

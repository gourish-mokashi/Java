package Inheritance;

class Method_Figure {
    double dimension1,dimension2;
    Method_Figure(double d1, double d2){
        dimension1=d1;
        dimension2=d2;
    }
    void calculateArea(){
         System.out.println("Area is Undefined");
    }
}
class Method_Rectangle extends Method_Figure{
    Method_Rectangle(double l,double b) {
        super(l, b);
    }
        void calculateArea(){
    System.out.println("The Area of the Rectangle is:\n"+ dimension1*dimension2);
}
}
class Method_Triangle extends Method_Figure {
    Method_Triangle(double base, double height) {
        super(base, height);
    }
    double area =0.5*dimension1*dimension2;
    void calculateArea(){
        System.out.println("The Area of the Triangle is:\n"+area);
    }

}
public class Method_Overriding2 {
    public static void main(String[] args) {
        Method_Figure f = new Method_Figure(2,3);
        f.calculateArea();
        Method_Figure fr = new Method_Rectangle(4,3);
        fr.calculateArea();
        Method_Figure ft = new Method_Triangle(4,5);
        ft.calculateArea();
    }
}
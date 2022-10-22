package Inheritance;
class Figure{
    double dimension1,dimension2;
    Figure(){
        dimension1=5;
        dimension2=4;
    }
    double calculateArea(){
        return dimension1*dimension2;
    }
}
class Rectangle extends Figure{
    Rectangle(double l,double b){
        dimension1=l;
        dimension2=b;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
       Rectangle rectangle =new Rectangle(3,4);
       double area=rectangle.calculateArea();
        System.out.println("The area of the Rectangle is:\n"+area);

    }
}

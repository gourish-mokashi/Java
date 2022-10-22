package Inheritance;

class Super_Figure{
    double dimension1,dimension2;
    Super_Figure(double d1,double d2){
        dimension1=d1;
        dimension2=d2;
}
double calculateArea(){
    return dimension1*dimension2;
    }
}
class Super_Rectangle extends Super_Figure{

    Super_Rectangle(double l, double b) {
        super(l, b);
    }
}



public class Super_Keyword {
    public static void main(String[] args) {
        Super_Rectangle rectangle=new Super_Rectangle(3,4);
        System.out.println("The Area of Rectangle is:\n"+rectangle.calculateArea());
    }
}

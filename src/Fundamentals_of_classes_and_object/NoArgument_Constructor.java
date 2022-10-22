package Fundamentals_of_classes_and_object;

class Rectangle{
    double length;
    double breadth;

    Rectangle() {
        length= 15.4;
        breadth = 10.3;
    }
    double calculateArea(){
        return length * breadth;
    }
}
public class NoArgument_Constructor {
    public static void main(String[] args) {
       // Scanner Sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();
/*
        System.out.println("Enter the Length: ");
        rect.length= Sc.nextInt();
        System.out.println("Enter the Breadth: ");
        rect.breadth= Sc.nextInt();
*/


        double area;
        area = rect.calculateArea();
        System.out.println("The Area of the following Rectangle is " + area);
    }
}

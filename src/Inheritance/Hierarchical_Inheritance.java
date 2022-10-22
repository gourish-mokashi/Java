package Inheritance;
class Hierarchical_Figure{
    double dimension1,dimension2;
    Hierarchical_Figure(double d1, double d2){
        dimension1=d1;
        dimension2=d2;
    }
    double calculateArea(){
        return dimension1*dimension2;
    }
}
class Hierarchical_Rectangle extends Hierarchical_Figure{
    Hierarchical_Rectangle(double l,double b){
        super(l,b);
    }
}
class Hierarchical_Triangle extends Hierarchical_Figure{
    Hierarchical_Triangle(double base,double height){
        super(base,height);
    }
}
public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Hierarchical_Rectangle r=new Hierarchical_Rectangle(3,2);
        System.out.println("The Length of the Rectangle is: "+r.dimension1);
        System.out.println("The Breath of the Rectangle is: "+r.dimension2);
        System.out.println("The Area of Rectangle is:\n"+r.calculateArea());
        Hierarchical_Triangle t=new Hierarchical_Triangle(4,5);
        System.out.println("The Base of the Triangle is: "+t.dimension1);
        System.out.println("The Height of the Triangle is: "+t.dimension2);
        System.out.println("The Area of the Triangle is:\n"+0.5*+t.calculateArea());

    }
}

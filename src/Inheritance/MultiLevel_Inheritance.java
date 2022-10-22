package Inheritance;
class MultiLevel_Figure{
    double dimension1,dimension2;
    MultiLevel_Figure(double d1,double d2){
        dimension1 =d1;
        dimension2=d2;
    }
    double calculateArea(){
        return dimension1*dimension2;
    }
}
class MultiLevel_Rectangle extends MultiLevel_Figure{
          MultiLevel_Rectangle(double l,double b){
              super(l,b);
          }
}
class MultiLevel_Square extends MultiLevel_Figure{
    MultiLevel_Square(double size){
        super(size,size);
    }
}
public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        MultiLevel_Figure f= new MultiLevel_Rectangle(3,4);
        System.out.println("The area of Rectangle is:\n"+f.calculateArea());
        MultiLevel_Square s=new MultiLevel_Square(3);
        System.out.println("The Area of Square is:\n"+s.calculateArea());
    }
}

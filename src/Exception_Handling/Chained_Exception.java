package Exception_Handling;
import java.io.IOException;

public class Chained_Exception {
static void check(int numA,int numB){
    if (numB==0){
        ArithmeticException a =new ArithmeticException("Divide by zero");
        a.initCause(new IOException());
        throw a;
    }
}
    public static void main(String[] args) {
        try {
            check(4,0);
        }catch (ArithmeticException e){
            System.out.println("Caught: "+e);
            System.out.println("underlying cause "+e.getCause());
        }
    }
}

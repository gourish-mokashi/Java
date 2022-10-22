package Exception_Handling;
class b{
    void call(){
        System.out.println("Getting called");
    }
}
public class multiple_exception_using_a_single_catch_block {
    public static void main(String[] args) {
        int var1=32;
        int var2 = 0;
        double result;
        b b=null;
        try {
            b.call();
            result=var1/var2;
            System.out.println("The result is: "+result);
        }
        catch (ArithmeticException | NullPointerException e){
            System.out.println("caught exception: "+e);
        }
    }
}

package Exception_Handling;
class a{
    void call(){
        System.out.println("Getting called");
    }
}
public class Multiple_catch_demo{
    public static void main(String[] args) {
        int var1 = 32;
        int var2=0;
        double result;
        a object =null;
        try {
            object.call();
            result =var1/var2;
            System.out.println("The result is: "+ result);
        }
        catch (ArithmeticException e){
            System.out.println("Any number cannot divide by zero");
        }
        catch(NullPointerException f){
            System.out.println("The reference to object is null ");
        }
    }
}

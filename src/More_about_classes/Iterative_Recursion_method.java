package More_about_classes;

public class Iterative_Recursion_method {
    public int Factorial(int num) {
       int fact=1;
       for (int i=1;i<=num;i++){
           fact =fact*i;
       }
       return fact;
    }

    public static void main(String[] args) {
        Iterative_Recursion_method ob=new Iterative_Recursion_method();
        int x =30;
        System.out.println("The Factorial of "+x+"is: "+ ob.Factorial(x));
    }
}

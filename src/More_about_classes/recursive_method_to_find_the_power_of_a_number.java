package More_about_classes;

import java.util.Scanner;

public class recursive_method_to_find_the_power_of_a_number{
    public static int power_of_Number(int base,int Exponent) {
        if (Exponent==0){
            return 1;
        }
        else if(Exponent==1){
            return base;
        }
        else
            return (base*power_of_Number(base,Exponent-1));
    }


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the Base");
        int base=scanner.nextInt();
        System.out.println("Enter the Exponent");
        int Exponent=scanner.nextInt();
        System.out.println("The Result is:\n"+power_of_Number(base,Exponent));

    }
}

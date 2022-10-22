package Bravocode;

import java.util.Scanner;

public class identifying_the_number_is_even_or_odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Enter the integer: ");
        num = s.nextInt();
        if (num ==0){
            System.out.println("0 is an neutral number");
        }
        else if (num % 2 ==0){
            System.out.println("There following Integer is Even");
        }
        else {
            System.out.println("The following Integer is Odd");
        }
    }
}

package Bravocode;

import java.util.Scanner;

public class Switch_method {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner s = new Scanner(System.in);
        System.out.println("enter num a: ");
        a = s.nextInt();
        System.out.println("enter num b: ");
        b= s.nextInt();
        System.out.println("Before Switching\n" +"a ="+ a +", b ="+ b);

        temp = a;
        a = b;
        b=temp;
        System.out.println("After Switching\n"+"a ="+ a+", b ="+b);


    }
}

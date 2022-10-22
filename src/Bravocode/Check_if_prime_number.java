package Bravocode;

import java.util.Scanner;

public class Check_if_prime_number {
    static boolean isPrime(int num) {
        boolean flag = true;
        for (int i = 2; i <=(num/2); i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=scanner.nextInt();

        if (isPrime(num) == true) {
            System.out.println("This number is Prime number");
        }
        else
        {
            System.out.println("This number is not a Prime Number");
        }
    }
}

package Bravocode;

import java.util.Scanner;

public class give_factors {
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
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();

        if (isPrime(num)==false){
            for (int i = 2; i<num; i++){
                if (num % i == 0){
                    System.out.print(i+" ");
                }
            }
        }
        else System.out.println(num+" is a prime number");
    }
}

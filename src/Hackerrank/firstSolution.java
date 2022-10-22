package Hackerrank;

import java.util.Scanner;

public class firstSolution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number (In case it should between 1 to 100)");
        int n= sc.nextInt();
        if (n <= 1 | n >= 100) {
            System.out.println("The Number should be between 1 to 100");
        }
        else if (n % 2 != 0) {
            System.out.println("Wried");
        }
        else if(n>=2&n<=5&n%2==0){
            System.out.println("Not Weird");
        }
        else if(n >= 6 & n <= 20 & n % 2==0){
            System.out.println("Weird");
        }
        else if(n > 20 & n % 2==0){
            System.out.println("Not Weird");
        }
    }
    }


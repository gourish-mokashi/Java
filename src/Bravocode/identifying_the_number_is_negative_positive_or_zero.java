package Bravocode;


import java.util.Scanner;

public class identifying_the_number_is_negative_positive_or_zero {
    public static void Identifier(double num){

        if(num ==0){
            System.out.println("The number is 0");
        }
        else if (num<0){
            System.out.println("The number is negative");
        }
        else if(num > 0){
            System.out.println("The number is Positive");
        }
        else {
            System.out.println("Invalid Input!");
        }
    }
    public static void main(String[] args) {

        Identifier(-65454765);
    }
}

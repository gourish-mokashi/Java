package Bravocode;

import java.util.Random;
import java.util.Scanner;

public class pick_a_random_number {
    public static void main(String[] args) {
        int maxrange;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum Range: ");
        maxrange=scanner.nextInt();
        Random random=new Random();
        System.out.println(random.nextInt(maxrange));

    }
}
package Bravocode;

import java.util.Random;

public class check_is_number_prime {

    static boolean isPrime(int random_number) {
        boolean flag = true;
        for (int i = 2; i <=( random_number/2); i++) {
            if (random_number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int max_num = 100;
        int random_number = random.nextInt(max_num);

        if (isPrime(random_number) == true) {
            System.out.println(random_number + "\nIs a Prime Number.");
        }
        else
        {
            System.out.println(random_number+"\nIs not prime number.");
        }

    }

}
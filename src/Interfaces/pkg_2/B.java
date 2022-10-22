package Interfaces.pkg_2;
import Interfaces.pkg_1.C;


public class B {
    public static void main(String[] args) {
        int b;
        int d;

            Interfaces.pkg_1.A pkg1 = new Interfaces.pkg_1.A();
            b = 2 * pkg1.a;
            System.out.println("The value of a is: " + pkg1.a);
            System.out.println("The value of b is: " + b);
            System.out.println("Phone No: " + pkg1.Phone_no);
            System.out.println("Holder Name : " + pkg1.Company);

                C obj =new C();
                d = 2 * obj.c;
        System.out.println("The value of c is: " + obj.c);
        System.out.println("The value of d is: " + d);




        }

    }

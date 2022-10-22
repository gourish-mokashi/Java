package Fundamentals_of_classes_and_object.Practice;

import java.util.Scanner;

public class online_shopping_system2 {
    static String Product;
    static String Price;


    public static void setProduct(String product) {
        Product = product;
    }

    public static void setPrice(String price) {
        Price = price;
    }

    public static void getProduct() {
        System.out.println(Product);
    }

    public static void getPrice() {
        System.out.println(Price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Product Name:");
        String Product=sc.nextLine();
        setProduct(Product);
        System.out.println("Enter maximum Price:");
        String Price=sc.nextLine();
        setPrice(Price);
        getProduct();
        getPrice();



    }
}

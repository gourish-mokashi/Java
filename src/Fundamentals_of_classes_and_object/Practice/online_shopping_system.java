package Fundamentals_of_classes_and_object.Practice;

import java.util.Scanner;
//class catalog{
//    public static String Product;
//
//     {
//        String Cost;
//        String Brand;
//
//        if (Product.equals("Samsung M51")){
//            Cost="15,840";
//            Brand="Samsung";
//            System.out.println("________Samsung M51________\nBrand:"+ Brand+"Price:"+Cost);
//        }
//        else if (Product.equals("Realme 3")){
//            Cost="11,200";
//            Brand="realme";
//            System.out.println("________Realme 3________\nBrand:"+ Brand+"Price:"+Cost);
//        }
//        else if (Product.equals("I Phone")){
//            Cost="11,200";
//            Brand="I Phone(Apple)";
//            System.out.println("________I Phone________\nBrand:"+ Brand+"Price:"+Cost);
//        }
//        else {
//            System.out.println("Oop! Invalid Input");
//        }
//
////        switch (Product) {
////            case "Samsung M51" -> {
////                Cost = "16,340 INR";
////                Brand = "Samsung";
////                System.out.println("Samsung M51\n" + "Brand:" + Brand + "\nCost:" + Cost);
////            }
////            case "Realme 3" -> {
////                Cost = "11,200 INR";
////                Brand = "Realme";
////                System.out.println("Realme 3\n" + "Brand:" + Brand + "\nCost:" + Cost);
////            }
////            case "I Phone 12" -> {
////                Cost = "98,250 INR";
////                Brand = "I Phone(Apple)";
////                System.out.println("Samsung M51\n" + "Brand:" + Brand + "\nCost:" + Cost);
////            }
////            default -> System.out.println("Oops! Invalid Input");
//        }
//
//    }


public class online_shopping_system {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String Product;
        String next_Step;
        String Answer;
        String Address;
        System.out.println("Enter the product name");
        Product = sc.nextLine();
            String Cost;
            String Brand;
            int quantity;

        switch (Product) {
            case "Samsung M51" -> {
                Cost = "15,840";
                Brand = "Samsung";
                System.out.println("________Samsung M51________\n\nBrand:" + Brand + "\nPrice:" + Cost);
                System.out.println("Enter next step");
                next_Step = sc.nextLine();
                switch (next_Step) {
                    case "add to cart" -> {
                        System.out.println("........Adding to Cart........");
                        System.out.println("Enter the Quantity");
                        quantity = sc.nextInt();
                        System.out.println("________Samsung M51________\n\nBrand:" + Brand + "\nPrice:" + Cost + "\nQuantity:" + quantity);
                        System.out.println("........Added to Cart........");
                        System.out.println("...place Order...");
                        System.out.println("Enter your Answer (yes/No)");
                        Answer=scanner.nextLine();
                        switch (Answer) {
                            case "yes" -> {
                                System.out.println("please enter Address");
                                Address = scanner.nextLine();
                                System.out.println("..........Order Successfully Placed..........");
                            }
                            case "No"-> {
                                System.out.println("OK,Order canceled Successfully");
                            }
                            default -> System.out.println("Oops! Invalid Input");
                        }

                    }
                    default -> System.out.println("Oops! Invalid Input");
                }
            }
            case "Realme 3" -> {
                Cost = "11,200";
                Brand = "realme";
                System.out.println("________Realme 3________\n\nBrand:" + Brand + "\nPrice:" + Cost);
                System.out.println("Enter next step");
                next_Step = sc.nextLine();

                switch (next_Step) {
                    case "add to cart" -> {
                        System.out.println("........Adding to Cart........");
                        System.out.println("Enter the Quantity");
                        quantity = sc.nextInt();
                        System.out.println("________Realme 3________\n\nBrand:" + Brand + "\nPrice:" + Cost + "\nQuantity:" + quantity);
                        System.out.println("........Added to Cart........");
                        System.out.println("...place Order...");
                        System.out.println("Enter your Answer (yes/No)");
                        Answer=scanner.nextLine();
                        switch (Answer) {
                            case "yes" -> {
                                System.out.println("please enter Address");
                                Address = scanner.nextLine();
                                System.out.println("..........Order Successfully Placed..........");
                            }
                            case "No"-> {
                                System.out.println("OK,Order canceled Successfully");
                            }
                            default -> System.out.println("Oops! Invalid Input");
                        }
                    }
                    default -> System.out.println("Oops! Invalid Input");
                }

            }
            case "I Phone" -> {
                Cost = "11,200";
                Brand = "I Phone(Apple)";
                System.out.println("________I Phone________\n\nBrand:" + Brand + "\nPrice:" + Cost);
                System.out.println("Enter next step");
                next_Step = sc.nextLine();

                switch (next_Step) {
                    case "add to cart" -> {
                        System.out.println("........Adding to Cart........");
                        System.out.println("Enter the Quantity");
                        quantity = sc.nextInt();
                        System.out.println("________I Phone________\n\nBrand:" + Brand + "\nPrice:" + Cost + "\nQuantity:" + quantity);
                        System.out.println("........Added to Cart........");
                        System.out.println("...place Order...");
                        System.out.println("Enter your Answer (yes/No)");
                        Answer=scanner.nextLine();
                        switch (Answer) {
                            case "yes" -> {
                                System.out.println("please enter Address");
                                Address = scanner.nextLine();
                                System.out.println("..........Order Successfully Placed..........");
                            }
                            case "No"-> {
                                System.out.println("OK,Order canceled Successfully");
                            }
                            default -> System.out.println("Oops! Invalid Input");
                        }
                    }
                    default -> System.out.println("Oops! Invalid Input");
                }
            }
            default -> System.out.println("Oop! Invalid Input");
        }
    }
}
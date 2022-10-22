package Bravocode;

//Java program to demonstrate use of this keyword

public class use_of_This_key {
    private String name;
    private int age;
    private float weight;

    //without using this keywords
    public void getDetailsWithoutThis(String name, int age, float weight) {
        name = name;
        age = age;
        weight = weight;
    }

    //using this keywords
    public void getDetailsWithThis(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void putDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }

    public static void main(String args[]) {
        //Object creation
        use_of_This_key objExThis = new use_of_This_key();

        objExThis.getDetailsWithoutThis("Mr. Neel", 25, 78.5f);
        System.out.println("Values after get details using getDetailsWithoutThis():");
        objExThis.putDetails();

        objExThis.getDetailsWithThis("Mr. Neel", 25, 78.5f);
        System.out.println("Values after get details using getDetailsWithThis():");
        objExThis.putDetails();
    }
}
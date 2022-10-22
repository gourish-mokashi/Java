package Java_Libraries;

public class String_Class {
    public static void main(String[] args) {
        String ob1= new String();
        System.out.println("Empty String "+ ob1);
        char arr[]={'j','a','v','a'};
        String ob2=new String(arr);
        System.out.println("Contents of ob2 are "+ob2);
        String ob3=new String(arr,1,3);
        System.out.println("contents of ob3 are "+ob3);
        String ob4=new String(ob3);
        System.out.println("Contents of ob4 are "+ ob4);
        String a="Hi";
        boolean b=true;
    
    }
}

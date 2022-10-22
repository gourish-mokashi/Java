package Exception_Handling;

public class Nested_Try_Block {
        public static void main(String[] args) {
        int var1=32;
        int var2=0;
        int arr[]={1,2,3,4,5};
        try {
            try {
                System.out.println("The Sixth Number os Array is: "+arr[6]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e+":is error");
            }
            System.out.println(var1/var2);
        }
        catch (ArithmeticException e){
            System.out.println(e+" :is error");
        }
    }
}

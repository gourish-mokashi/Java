package Fundamentals_of_classes_and_object;
class CallByReference{
    int a,b;
    public CallByReference(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void Swap (CallByReference c1){
        int temp;
        temp = c1.a;
        c1.a = c1.b;
        c1.b = temp;
    }
}

public class SwapDemo {
    public static void main(String[] args) {
        CallByReference c = new CallByReference(20,30);
        System.out.println("Values before method call: ");
        System.out.println("a= "+ c.a +" b= "+ c.b);
        c.Swap(c);
        System.out.println("Values After method call: ");
        System.out.println("a= "+ c.a +" b= "+ c.b);
    }
}

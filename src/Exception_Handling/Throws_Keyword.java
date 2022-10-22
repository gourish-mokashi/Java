package Exception_Handling;
class D{
    public void callme()throws IllegalAccessException {
         throw new IllegalAccessException("Not Allowed to Enter!");
    }
}
public class Throws_Keyword {
    public static void main(String[] args) {
        try {
            D d= new D();
            d.callme();
        }catch (IllegalAccessException e){
            System.out.println("Access Denied: "+e);
        }
    }
}

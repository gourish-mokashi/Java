package Exception_Handling;
class C{
    public void callMe(){
      throw new NullPointerException("Null Pointer Access");
    }
}
public class Throw_Keyword{
    public static void main(String[] args) {
        C o=new C();
        try {
            o.callMe();
        }
        catch (NullPointerException e){
            System.out.println("Error Caught: " + e );
        }
    }
}

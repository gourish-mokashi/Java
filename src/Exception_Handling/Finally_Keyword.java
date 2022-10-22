package Exception_Handling;
class E{
    public void callme(){
        try {
            throw new IllegalAccessException("Access denied");
        }catch (IllegalAccessException e){
            System.out.println("Caught Exception: "+e);
        }finally {
            System.out.println("Finally executes with thrown Exception is handled");
        }
    }
}
public class Finally_Keyword {
    public static void main(String[] args) {
        E e=new E();
        e.callme();
    }
}

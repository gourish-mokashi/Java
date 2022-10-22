package Exception_Handling;
class Custom_Exceptions extends Exception{
    int qty;
    public Custom_Exceptions(int qty){
        this.qty=qty;
    }
    public String toString(){
        return "Order quantity "+qty+" is not sufficient";
    }
}
public class User_defined_Exceptions {
    public static void main(String[] args) {
        checkQuantity(150);
        checkQuantity(240);
    }
    static void checkQuantity(int qty){
        try {
            if (qty<200){
                throw new Custom_Exceptions(qty);
            }else
                System.out.println("Order Successful");
        }catch (Custom_Exceptions e){
            System.out.println(e);
        }
    }
}

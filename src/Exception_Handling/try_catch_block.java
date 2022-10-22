package Exception_Handling;

import java.util.concurrent.ExecutionException;

public class try_catch_block {
    public static void main(String[] args) {
        int var=32;
        double result;
        try {
            result=var/0;
            System.out.println("The result is:"+result);
        }
        catch (Exception e){
            System.out.println("caught exception: "+e);
        }
    }
}

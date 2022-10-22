package Bravocode;

public class running_an_Application {
    public static void main(String[] args) {
        Runtime app=Runtime.getRuntime();
        try {
            //app.exec("Notepad");
            app.exec("calc");

        }
        catch (Exception e){
            System.out.println("Error: "+e.toString());
        }
    }
}

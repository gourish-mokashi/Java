package Bravocode;


public class Use_of_static_key {
        static int num(int a, int b){
          int i;
          if (a==0){
            i =(a + 100) * b;
          }
          else {
              i = a+b;
          }
          return i;
         }
    public static void main(String[] args) {

              int c;
              c= num(0 ,12);
        System.out.println("c");
    }
}

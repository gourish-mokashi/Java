package Multithreading;
class jobber1 implements Runnable{
    public void run(){
        System.out.println("I am jobber 1");
    }
}
class jobber2 implements Runnable{
    public void run(){
        System.out.println("I am jobber 2");
    }
}
public class Join_Demo {
    public static void main(String[] args) {
        try {
            jobber1 jobber1=new jobber1();
            Thread Jobber1=new Thread(jobber1);
            Jobber1.start();
            System.out.println("Jobber1 status: "+Jobber1.isAlive());
            Jobber1.join();

            jobber2 jobber2=new jobber2();
            Thread Jobber2 =new Thread(jobber2);
            Jobber2.start();
            Jobber2.join();
            System.out.println("Jobber2 status: "+Jobber2.isAlive());

            System.out.println("Jobber1 status: "+Jobber1.isAlive());

            System.out.println("Main thread completing");
        }  catch (InterruptedException e){
            System.out.println(e);
        }


    }
}

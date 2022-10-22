package Multithreading;
class j1 implements Runnable{
    public void run(){
        System.out.println("I am Job1");
    }
}
class j2 implements Runnable{
    public void run(){
        System.out.println("I am Job2");
    }
}
public class isAlive_Demo {
    public static void main(String[] args) {
        j1 job1 =new j1();
        Thread job1Runner =new Thread(job1);
        job1Runner.start();
        System.out.println("Job1Runner status: "+
                job1Runner.isAlive());


        j2 job2 =new j2();
        Thread job2Runner =new Thread(job2);
        job2Runner.start();
        System.out.println("Job2Runner status: "+job2Runner.isAlive());

        System.out.println("Job1Runner status: "+job1Runner.isAlive());
    }
}

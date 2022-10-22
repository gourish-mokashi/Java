package Multithreading;
class job implements Runnable{
    public void run(){
        try{
            System.out.println("[This is child ");
            Thread.sleep(500);
            System.out.println("running]");
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
public class Creating_multiple_Threads {
    public static void main(String[] args) {
        job job1=new job();
        Thread jobRunner1 = new Thread(job1);
        jobRunner1.start();

        Thread jobRunner2=new Thread(job1);
        jobRunner2.start();
    }




}

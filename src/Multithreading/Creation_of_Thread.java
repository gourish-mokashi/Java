package Multithreading;

class Job1 implements Runnable{
    public void run(){
        System.out.println("I am a job created by implementing Runnable");
    }
}
class Job2 extends Thread{
    public void run(){
        System.out.println("I am a job by extending Thread Which implements Runnable. Bad design");
    }
}
public class Creation_of_Thread {
    public static void main(String[] args) {
        Job1 job1=new Job1();
        Thread jobRunner =new Thread(job1);
        Job2 job2=new Job2();
        Thread job2Runner=new Thread(job2);
            jobRunner.start();
            job2Runner.start();
    }
}
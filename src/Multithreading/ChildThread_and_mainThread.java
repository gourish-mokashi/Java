package Multithreading;
class ChildThread implements Runnable{
    Thread t;
    ChildThread(){
        t=new Thread(this,"child thread");
        System.out.println("Child"+t);
        t.start();
    }
    public void run(){
        try {
            for (int i=1;i<5;i++){
                System.out.println("child running "+i+" time");
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
public class ChildThread_and_mainThread {
    public static void main(String[] args) {
        new ChildThread();
        try {
            for (int i=1;i<5;i++){
                System.out.println("Main running "+i+" time");
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

package Multithreading;

public class MainThread {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("Id:"+t.getId());
        System.out.println("Name:"+t.getName());
        System.out.println("Thread object:"+t);
        t.setName("My Main thread");
        System.out.println("Name:"+t.getName());
    }
}

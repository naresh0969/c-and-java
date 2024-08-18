
/*1. Write a program to create MyThread class with run() method and then attach a thread to
this MyThread class object. */
package B201013.Lab10;
class Rthread implements Runnable{
    public void run(){
        System.out.println("Thread is executed!");
    }
}
public class MyThread {
    public static void main(String args[]){
        Rthread obj=new Rthread();
        Thread obj2=new Thread(obj);
        
        obj2.start();
    }
    
}

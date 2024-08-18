//Multithreading using Threads.

class Mythread extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("Hello");
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(i);
            try{
//sleep
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class MultiThread {
    public static void main(String args[]){
        Mythread obj=new Mythread();
        obj.start();
        for(int i=0;i<100;i++){
            System.out.println("world");
        }
        Thread2 obj2=new Thread2();
        obj2.start();
    }
}

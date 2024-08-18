//1. Write a program to create MyThread class with run() method and then attach a thread to this MyThread class object
package B201013.Lab9B;

class MyThread extends Thread{
    public void run(){
        for(int i=1;i<11;i++){
            try{
                System.out.print(i+" ");
                sleep(1000);

            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class ThreadC {
    public static void main(String args[]){
        MyThread t1=new MyThread();
        t1.start();

    }
    
}

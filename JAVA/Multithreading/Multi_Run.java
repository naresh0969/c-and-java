//Multithreading using Runnable interface.
class My implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hello ");
        }
    }
}
public class Multi_Run {
    public static void main(String args[]){
        My obj=new My();
        Thread t=new Thread(obj);
        t.start();
        for(int i=0;i<100;i++){
            System.out.println(" world");
        }
    }
}

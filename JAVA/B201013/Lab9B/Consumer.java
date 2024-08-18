/*2. Write a program where the consumer thread checks the data production status [ is
over or not ] for every 10 ms. */

package B201013.Lab9B;
class ConsumerT extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            try{
                System.out.println("Production status : Not completed");
                sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Production status : Completed");
    }
}

public class Consumer {
    public static void main(String args[]){
        ConsumerT t1=new ConsumerT();
        t1.start();

    }
}

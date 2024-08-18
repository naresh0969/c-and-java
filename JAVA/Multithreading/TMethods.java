class Mythread extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i);
            i++;
        }
    }
}
public class TMethods{
    public static void main(String args[]) throws Exception{
        Mythread obj1=new Mythread();
//setDeamon()
        obj1.setDaemon(true);
        obj1.start();
//join()
        Thread mainThread=Thread.currentThread();
        mainThread.join();

    }
}

class Mthread extends Thread{
    Mthread(String s){
        super(s);
    }
    public void showTicket(){
        System.out.println(getName()+" Showed Ticket");
    }
    public void getTicket(){
        System.out.println(getName()+" got Ticket");
        showTicket();
    }
    public void run(){
        getTicket();
    }

}

public class MovieT {
    public static void main(String args[]){
        Thread arr[]=new Thread[100];
        for(int i=0;i<5;i++){
            String s="Person"+i;
            arr[i]=new Thread(new Mthread(s) );
            arr[i].start();
        }
    }
}

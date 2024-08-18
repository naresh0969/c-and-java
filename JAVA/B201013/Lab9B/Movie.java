/*4. Write a Program using Threads for the following case study: Movie Theatre
To watch a movie the following process is to be followed, at first get the ticket then show
the ticket. Assume that N persons are trying to enter the Theatre hall all at once, display
their seuence of entry into theater.
Note: The person should enter only after getting a ticket and showing it to the boy. */


class Theatre extends Thread{
    Theatre(String s){
        super(s);
    }
    public void enter(){
        System.out.println(this.getName()+"Entered");
    }
    public void showTicket(){
        System.out.println(this.getName()+" Has Showed Ticket");
        enter();
    }
    public void getTicket(){
        System.out.println(this.getName()+" Get Ticket");
        showTicket();
    }
    @Override
    public void run(){
        getTicket();
    }
}
public class Movie {
    public static void main(String args[]){
        Thread[] t=new Thread[100];
        for(int i=0;i<5;i++){
            String p="Person "+(i+1);
            t[i]=new Thread(new Theatre(p));
            t[i].start();
        }

    }
    
}
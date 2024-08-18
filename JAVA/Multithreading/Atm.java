class Atms{
    
        synchronized public void check(String s){
            System.out.print(s+" Checking ");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            System.out.println("balance ");
        }
        synchronized public void withdraw(String s,int amt){
            System.out.print(s+" Withdrawing money ");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            System.out.println(amt);

        }
    
}

class customer extends Thread{
    String name;
    Atms useAtm;
    int amount;
    customer(String s,int amt,Atms atm){
        name=s;
        amount=amt;
        useAtm=atm;
    }
    public void using(){
        useAtm.check(name);
        useAtm.withdraw(name,amount);
    }
    public void run(){
        using();
    }

}
public class Atm {
    public static void main(String args[]){
        Atms atm1=new Atms();
        customer c1=new customer("naresh", 1000, atm1);
        customer c2=new customer("shiva", 3000, atm1);
        c1.start();
        c2.start();

    }
    
}

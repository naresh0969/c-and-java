import java.util.*;

//final in class, we can't extend this class.
final class voting{


    // final in method, we can inherit it but can't override.
    final public void voting_system(){
        System.out.println("Ballot box and EVM machines");
    }
}


public class final_demo {

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);


        //blank final variable.
        final String pan;
        System.out.println("Create PAN NUMBER");
        pan=scan.next();
        System.out.println(pan);

        //final in variable
        final int deal=100000;
        System.out.println(deal);
        scan.close();
        


    }
    
    
}

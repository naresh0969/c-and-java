/*4. Create a class Account with an instance variable balance (double). It shouldcontain a
constructor that initializes the balance, ensure that the initial balance is
greater than 0.0.
Acct details : Acct_Name, Acct_acctno, Acct_Bal, Acct_Address.
Create two methods namely credit and debit, getBalance.
The Credit adds the amount (passed as parameter) to balance and does not return any
data. Debit method withdraws money from an Account. GetBalance displays the
amount.
Ensure that the debit amount does not exceed the Account’s balance. In that case the
balance should be left unchanged and the method should print a message indicating
“Debit amount exceeded account balance”.
 */
import java.util.Scanner;
class Account{
    Scanner scan=new Scanner(System.in);
    double balance=0.0;
    String Acct_Name,Acct_Address;
    int Acct_acctno;
    Float Acct_Bal;
    Account(float Amount){
        balance=Amount;
        System.out.print("Account Holder Name :");
        Acct_Name=scan.nextLine();
        System.out.print("Address :");
        Acct_Address=scan.nextLine();
        System.out.print("Account Number :");
        Acct_acctno=scan.nextInt();
        
    }


    void credit(){
        Float value;
        System.out.println("Enter credit amount: ");
        value=scan.nextFloat();
        balance+=value;
    }
    void debit(){
        Float value;
        System.out.println("Enter Amount to Withdraw :");
        value=scan.nextFloat();
        if(value<=balance){
            balance-=value;
        }
        else{
            System.out.println("Debit amount exceeded account balance!");
        }
    }
    void getBalance(){
        System.out.println("Current balance = "+balance);
    }
}
public class Bank {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        float balance;
        System.out.println("Enter Amount to Create Account");
        balance=scan.nextFloat();
        if(balance>0.0){
            Account acc=new Account(balance);
            boolean exit=true;
            while(exit){
                int option;
                System.out.println("\nEnter :");
                System.out.println("1 For money withdraw ");
                System.out.println("2 For money Deposit ");
                System.out.println("3 to Check balance ");
                System.out.println("-1 to Exit");
                option=scan.nextInt();
                switch(option){
                    case -1:exit=false;break;
                    case 1:acc.debit();break;
                    case 2:acc.credit();break;
                    case 3:acc.getBalance();break; 
                    default :System.out.println("choose correct option ");
                }
    
    
            }
        }
        else{
            System.out.println("Should Deposit >0.0 money!");
        }
        scan.close();
    }
    
}

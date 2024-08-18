//Write a program to find prime factors of a number.
import java.util.*;
class prime{
    int num;
    
    void primefactor(){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                for(int j=1;j<=i;j++){
                    if(i%j==0) count++;
                }
                if(count==2){
                    System.out.println(i);
                }
                count=0;
            }
        }
    }
}
public class primef {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number :");
        prime check=new prime();
        check.num=scan.nextInt();
        check.primefactor();
        scan.close();
    }
}

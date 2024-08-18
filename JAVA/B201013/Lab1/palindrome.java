
import java.util.*;
class check{
    int num,result=0;
    
    void palin(){
        int dup=num;
        while(dup!=0){
            result=(result*10)+dup%10;
            dup/=10;
        }
        if(result==num){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome!");
        }
    }
    
}
public class palindrome {
    static int num;
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        check Check=new check();
        System.out.print("Enter a number :");
        Check.num=s.nextInt();
        Check.palin();
        s.close();
    }
}
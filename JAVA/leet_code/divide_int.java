
// divide given integer with the given divisor return quotient
import java.util.*;
class Solution{
    public int divide(int dividend,int divisor){
        if(dividend==1<<31 && divisor==-1) return Integer.MAX_VALUE;
        boolean sign=((dividend>=0)&&(divisor>=0))?true:false;
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        int result=0;
        while(dividend-divisor>=0){
            int count=0;
            while(dividend-(divisor<<1<<count)>=0){
                count++;
            }
            result+=1<<count;
            dividend-=divisor<<count;
        }
        return sign? result:-result;
    }
}
public class divide_int {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Dividend :");
        int dividend=scan.nextInt();
        System.out.println("Divisor");
        int divisor=scan.nextInt();
        Solution obj=new Solution();
       int ans= obj.divide(dividend, divisor);
       System.out.println(ans);
        scan.close();
    }
}

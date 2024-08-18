package leet_code;
import java.util.*;

class solution{
    boolean monotonic(int nums[]){


        int asc[]=new int[nums.length];
        int dec[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            asc[i]=nums[i];
            dec[i]=nums[i];
        }
        Arrays.sort(asc);
        Arrays.sort(dec);
        for(int i=0;i<nums.length/2;i++){
            int temp=dec[i];
            dec[i]=dec[nums.length-i-1];
            dec[nums.length-i-1]=temp;

        }
        boolean isequal1=Arrays.equals(nums, dec);
        boolean isequal2=Arrays.equals(nums,asc);
        if(isequal1||isequal2){
            System.out.println("Monotonic true");
        }
        else{
            System.out.println("false");
        }
        return (isequal1||isequal2);
        
    }
   
}
public class monotonic2 {
    public static void main(String args[]){
        int nums[]={5,4,1};
        solution s1=new solution();
        s1.monotonic(nums);

    }
    
}

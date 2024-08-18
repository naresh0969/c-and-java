/*3. Write java program that inputs 5 numbers, each between 10 and 100 inclusive. As
each number is read display it only if it’s not a duplicate of any number already read
display the complete set of unique values input after the user enters each new value */

package lab3;
import java.util.*;
public class duplicate {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            int flag=0;
            int num=scan.nextInt();
            if(num>=10&&num<=100){
                for(int j=0;j<=i;j++){
                    if(num==arr[j]){
                        flag=1;
                    }
                }
                if(flag==1){
                    i--;
                }
                else{
                    arr[i]=num;
                }
            }
            else{
                System.out.println("Enter value in range :");
                i--;
            }
            
        }
        System.out.println("Result :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        scan.close();
        
    }
}

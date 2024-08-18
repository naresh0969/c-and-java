//Q1 Write java program to sort given list of numbers.

import java.util.*;
class sort{
    void sorting(int a[],int size){
        for(int j=size;j>0;j--){
            for(int i=0;i<size-1;i++){
                if(a[i]>a[i+1]){
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        
    }

}
public class array {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int size;
        System.out.print("How many numbers have to sort ? :");
        size=scan.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=scan.nextInt();

        }
        sort s1=new sort();
        
        s1.sorting(a,size);
        
        scan.close();
       


    }
}

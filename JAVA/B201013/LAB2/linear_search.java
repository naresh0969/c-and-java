//Q2 Write a java program  to implment linear search.

import java.util.*;
class searching{
    void search(int a[],int size,int key){
        for(int i=0;i<size;i++){
            if(a[i]==key){
                System.out.println(key+" is present in the list.");
                return;

            }
        }
        System.out.println(key+" is not present");
    }
}
public class linear_search {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int size;
        System.out.print("Enter size :");
        size=scan.nextInt();
        int a[]=new int [size];
        for(int i=0;i<size;i++){
            a[i]=scan.nextInt();
        }
        int key;
        System.out.print("enter key to search :");
        key=scan.nextInt();
        searching a1=new searching();
        a1.search(a,size,key);
        scan.close();
    }
}

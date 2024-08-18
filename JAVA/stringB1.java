//1 Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

import java.util.*;
public class stringB1 {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int size;
        System.out.println("Enter number of words :");
        size=scan.nextInt();
        StringBuilder [] array=new StringBuilder[size];
        int count=0;
        for(int i=0;i<size;i++){
            System.out.print("enter "+(i+1) +" string :");
            String input=scan.next();
            array[i]=new StringBuilder(input);
            count+=array[i].length();
        }
        System.out.println(count);        
        scan.close();
    }
}

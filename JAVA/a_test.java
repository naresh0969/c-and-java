
import java.util.*;


import java.util.ArrayList; 
import string.string_buffer;
public class a_test {
    public static void main(String args[]){
        // //storing in binary 
        // int num1=0b1010;
        // System.out.print("in decimal for :"+num1);
        // int num=5;
        // //tenary operator.
        
        // int num2=num>2?4:6;
        // System.out.println(num2);
        // System.out.println(5/2);
        // System.out.println("1 :"+(int)'1');
        // System.out.println("A :"+(int)'A');


        ArrayList<Object>arr=new ArrayList<Object>();
        System.out.println("capacity 1 "+Capacity());
        arr.add("Naresh");
        arr.add(24);
        arr.add(23.4);
        System.out.println(arr.get(0));
        arr.set(1,"Damera");
        System.out.println(arr);
        arr.add(2,"hyderabad");
        System.out.println(arr);
        System.out.println("---");
        Iterator <Object> it=arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}

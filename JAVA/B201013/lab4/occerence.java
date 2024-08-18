/*3. Write an application that uses String method indexOf to determine the total
number of occurrences of any given alphabet in a defined text.*/
package lab4;
import java.util.*;

//method 1
class find_occerence{
    void character(String str,char key){
        int i=str.length()-1,count=0;
        while(i!=-1){
            if(str.charAt(i)==key){
                count++;
            }
            i--;
        }
        System.out.println(str.indexOf(key));
        System.out.println("Occerence is :"+count);
    }

}



public class occerence {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter text");
        String str=scan.nextLine();
        System.out.print("Enter character ");
        char key=scan.next().charAt(0);
        System.out.println("Length="+str.length());
        find_occerence find=new find_occerence();
        System.out.println("index is "+str.indexOf(key));
        find.character(str,key);

        //method 2

        long count= str.chars().filter(ch -> ch == key).count();
        System.out.println("occerence"+count);

        //method 3
        int index=str.indexOf(key),count2=0;
        while(index!=-1){
            count++;
            str.indexOf(key,index+1);
        }
        System.out.println("Occerence by method 3 :"+count2);
        scan.close();
        
        
    }
}

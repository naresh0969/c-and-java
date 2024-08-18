/*5. Write a Java program to print all vowels in given string and count number of vowels and
consonants present in given string*/

package lab4;
import java.util.*;
public class vowels {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str;
        System.out.print("Enter a String :");
        str=scan.next();
        str=str.toLowerCase();
        int vcount=0,ccount=0;
        System.out.print("vowels :");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                System.out.print(str.charAt(i)+" ");
                vcount++;
                
            }
            else{
                ccount++;
            }
        }
        System.out.println();
        System.out.println("Vowel count :"+vcount);
        System.out.println("Consonant count :"+ccount);
        scan.close();

    }
    
}

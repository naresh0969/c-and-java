/*1 Write an application that uses String method compareTo to compare two strings
defined by the user. */
/*2. Write an application that uses String method equals and equalsIgnoreCase to tests
any two string objects for equality.*/
/*4.Write an application that uses String method concat to concatenate two defined
strings */
/*


.
*/
package lab4;

import java.util.*;
public class string_compare {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String s1,s2;
        System.out.print("Enter a String ");
        s1=scan.next();
        System.out.print("Enter 2nd string ");
        s2=scan.next();
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.concat(s2));
        scan.close();

    }
    
}

/*9. Write an application that changes any given string with uppercase letters, displays
it, changes it back to lowercase letters and displays it */

package lab4;

import java.util.*;
public class case_convert {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str;
        System.out.println("Enter a string :");
        str=scan.next();
        System.out.println("in upper case letters :"+str.toUpperCase());
        System.out.println("in lowercase :"+str.toLowerCase());
        scan.close();
    }
}

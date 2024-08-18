/*8. Write an application that finds the substring from any given string using substring
method and startsWith & endsWith methods */

package lab4;
import java.util.*;
public class sub_string {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str;
        int start,end;
        System.out.println("Enter a string :");
        str=scan.next();
        System.out.print("Start index ");
        start=scan.nextInt();
        System.out.print("End index");
        end=scan.nextInt();
        System.out.println(str.substring(start,end+1));
        scan.close();
    }
}

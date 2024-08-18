/*7. Write an application that uses String method charAt to reverse the string. */

package lab4;
import java.util.*;
public class string_rev {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str1="telangana",str2="";
        for(int i=0;i<str1.length();i++){
            str2+=str1.charAt(str1.length()-1-i);
        }
        System.out.println(str2);

        scan.close();
    }
}

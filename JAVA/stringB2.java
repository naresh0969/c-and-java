/*
 2 Input a string from the user. Create a new string called ‘result’ in which you will replace
  the letter ‘e’ in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”
 */


import java.util.*;
public class stringB2 {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        StringBuilder result=new StringBuilder("");
        System.out.println("Enter a string :");
        String string=scan.next();
        StringBuilder word=new StringBuilder(string);
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='e'){
              result.append('i');

            }
            else{
                result.append(word.charAt(i));
            }
            
        }
        System.out.println(result);
        // System.out.println(word);
        scan.close();

    }
}

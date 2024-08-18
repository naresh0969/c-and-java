/*5. Exception Handling program for NumberFormatException--thrown if a program is
attempting to convert a string to a numerical datatype, and the string contains
inappropriate characters (i.e. 'z' or 'Q'). */
package Lab9;

public class NumberFormatE {
    public static void main(String args[]){
        String str="1jfhf";
        try{
            int a=Integer.parseInt(str);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}

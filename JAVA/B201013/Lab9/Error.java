/*2. Write a program that shows that the order of the catch blocks is important. If you try to
catch a superclass exception type before a subclass type, the compiler should generate
errors. */
package Lab9;

public class Error {
    public static void main(String args[]){
        try{
            int a=10/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}

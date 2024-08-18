/*1. Program for demonstrating the use of throw, throws & finally - Create a class with a
main( ) that throws an object of class Exception inside a try block. Give the constructor
for Exception a String argument. Catch the exception inside a catch clause and print the
String argument. Add a finally clause and print a message to prove you were there */
package Lab9;
class Test{
    public void testing(int num1,int num2) throws Exception{
        if(num1<0||num2<0) throw new Exception("NegativeNumberException");
    }
}
public class ExceptionDemo {
    public static void main(String args[]){
        Test obj=new Test();
        try{
            obj.testing(-1,3);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally block executed");
        }
    }
    
}

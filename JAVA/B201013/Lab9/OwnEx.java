/*6. Create your own exception class using the extends keyword. Write a constructor for this
class that takes a String argument and stores it inside the object with a String reference.
Write a method that prints out the stored String. Create a try- catch clause to exercise your
new exception */

package Lab9;
class NegitiveValueException extends Exception{
    public NegitiveValueException(String msg){
        super(msg);
    }
}

public class OwnEx {
    public static void check(int value1, int value2) throws NegitiveValueException{
        if(value1<0||value2<0){
            throw new NegitiveValueException("NegitiveValueException");
        }
    }
    public static void main(String args[]){
        try{
            check(-10,-8);
        }
        catch(NegitiveValueException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("remain");
        }
    }
    
}

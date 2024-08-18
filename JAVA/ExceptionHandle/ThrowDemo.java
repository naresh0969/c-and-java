package ExceptionHandle;
class NegativeException extends Exception{
    public String toString(){
        return "Dimentions should not negative";
    }
}

public class ThrowDemo {
    static int area2(int a,int b) throws NegativeException{
        if(a<0||b<0){
            throw new NegativeException();
        }
        return a*b;
    }
    public static void main(String args[]){

        try{
            System.out.println("Area ="+area2(10,-4));
        }
        catch(NegativeException e){
            System.out.println(e);
        }
    }
}

class FinalException extends Exception{
    public String toString(){
        return "Working";
    }
}
public class FinallyDemo{

    static void m1() throws FinalException{
        throw new FinalException();

    }
    static void m2() throws FinalException{
        
        try{
            System.out.println(10/0);
        }
        finally{
            System.out.println("final message");
        }
        m1();
       
    }

    public static void main(String args[]){

        try{
            m2();
        }
        catch(FinalException e){
            System.out.println(e);
        }
    }
}
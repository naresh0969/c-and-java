package ExceptionHandle;
class Balance extends Exception{
    public String toString(){
        return "Minimum balance should be 5000";
    }
}
public class CustomException {
    static void test2(int a) throws Exception{
        if(a<5000){
            throw new Balance();
        }
    }
    static void test1() throws Exception{
        test2(4000);
    }
    
    public static void main(String args[]){
        try{
            test1();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

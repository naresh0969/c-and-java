class BadException extends Exception{
    BadException(String s){
        super(s);
    }
}
public class Own {
    static void method2(int n1,int n2) throws BadException{
        if(n1<0||n2<0){
            throw new BadException("give positive values");
        }
    }
    static void method1() throws BadException{
        method2(-1,-4);
    }
    public static void main(String args[]){
        try{
            method1();
        }catch(BadException e){
            System.out.println(e);
        }

    }
    
}

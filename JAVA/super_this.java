import java.util.*;
class A{
    Scanner scan=new Scanner(System.in);
    public A(int n){
       System.out.println("int in A");
    }
    public A(){
        System.out.println("in A ");
    }

}

class B extends A{
    public B(){
        System.out.println("in B");
    }
    public B(int n){
        this();
        
        System.out.println("int in B");
    }
}
public class super_this {
    public static void main(String args[]){
        B obj=new B(5);
    
    }
}

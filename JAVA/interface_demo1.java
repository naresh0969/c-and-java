/**
 * interface
 */
interface A {
    void printa();
    
}
interface B{
    void printb();
}
class C implements A,B{
    public void printa(){
        System.out.println("in A");
    }
    public void printb(){
        System.out.println("in B");
    }
}
public class interface_demo1{
    public static void main(String args[]){
        C obj=new C();
        obj.printa();
        obj.printb();

    }
}

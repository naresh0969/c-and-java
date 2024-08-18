
class A{
    public void print(){
        System.out.println("In A");
    }
}
class B extends A{
    public void print(){
        System.out.println("In B");
    }
}
class C{
    public void print(){
        System.out.println("in C");
    }
}
public class test2 {
    public static void main(String args[]){
        
        A obj=new A();
        obj.print();
        A obj1=new B();
        obj1.print();
       // obj=new C();

    }
}

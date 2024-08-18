class thread1 extends Thread{
    public String name="Naresh";
    thread1(String s){
        name=s;
    }
    public void run(){
    }
    public void print(){
        System.out.println(name);
    }
}
public class MultiT {
    public static void main(String args[]){
        thread1 obj=new thread1("Ganesh");
        obj.print();
        thread1 obj2=new thread1("India");
        obj2.print();

    }
}

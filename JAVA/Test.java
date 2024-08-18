abstract class vechicle{
    abstract public void print();
    public void print2(){
        System.out.println("2nd print executed");
    }
}
class bike extends vechicle{
    public void print(){
        System.out.println("1st method is executed");
    }
}
public class Test{
    public static void main(String args[]){

    }
}
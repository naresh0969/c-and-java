package string;

class test1{
    void print(){
        System.out.println("hii");
    }
}

class test extends test1{

    void print(int a){
        //super.print();
        System.out.println("hello");
    }
}

public class stat {
    public static void main(String args[]){
        test c=new test();
        test1 d=new test1();
        c.print(4);
        // d.print();
        //test.display();
    }
}

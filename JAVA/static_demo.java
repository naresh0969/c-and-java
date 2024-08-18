class student{
    String name;
    int id;


    //static as variable
    static String std="C4";
    public void print(){
        System.out.println(name+" "+id+" "+" "+std);
    }


    //static as method.
    public static void  updatestd(){
        std="cse";
    }
}

public class static_demo{


    //static as block
    static{
        System.out.println("before main method");
    }
    public static void main(String args[]){
        student aList[]=new student[1];
        aList[0]=new student();

        aList[0].name="prem";
        aList[0].id=20;
        aList[0].print();
        // student.updatestd();
        aList[0].print();

        
    }
}
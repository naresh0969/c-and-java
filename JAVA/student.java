class stud{
    int id;
    String name;
    String branch;
    stud(){
        id=38;
        name="naresh";
        branch="CSE";
    }
    stud(int x,String nam,String branc){
        id=x;
        name=nam;
        branch=branc;
    }
    void display(){
        System.out.println(id+" "+name+" "+branch);
    }
}
public class student {
    public static void main(String args[]){
        stud c1=new stud();
        c1.id=28;
        c1.name="vijay";
        c1.branch="CSE";
        stud c2=new stud(45,"sai","ece");
        c1.display();
        c2.display();
    }
}

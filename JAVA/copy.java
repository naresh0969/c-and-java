
public class copy{
    public static void main(String args[]){
        student s1=new student();
        s1.name="naresh";
        s1.roll=39;
        s1.std="c4";
        student s2=new student(s1);
        System.out.println(s2.name); 
        System.out.println(s2.roll); 
        System.out.println(s2.std); 

    }
    
  
}
class student{
    String name;
    int roll;
    String std;
    student(){

    }
    student(student s1){
        this.name=s1.name;
        this.roll=s1.roll;
        this.std=s1.std;
    }

}
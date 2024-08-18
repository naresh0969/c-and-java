/*5. Write Java program for the following
a. Example for this operator and the use of this keyword.
b. Example for super keyword.
c. Example for static variables and methods. */
class Cse{
    static String college="RGUKT";
}
class C4 extends Cse{
    String  name;
    int roll;
   static void show(){
        college="IIIT";
    }
}
public class Static {
    public static void main(String args[]){
        C4 obj=new C4();
        System.out.println(obj.college); 
        obj.show();
        System.out.println(obj.college); 

    }
}

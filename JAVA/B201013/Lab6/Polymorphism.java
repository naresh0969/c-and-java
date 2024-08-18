/*2. Write a Java program which can give example of Method overloading and overriding */

//method overload
class Overload{
    int sum(int a, int b){
        return (a+b);
    }
    float sum(float a, float b){
        return (a+b);
    }
    void check(){
        System.out.println("Method not overrided");
    }
}
//method override
class Override extends Overload{
    void check(){
        System.out.println("Method Overrided.");
    }

}
public class Polymorphism {
    public static void main(String args[]){
        Overload obj=new Overload();
        obj.check();
        System.out.println(obj.sum(2,5));
        System.out.println(obj.sum((float)10.4,(float)5.7));
        Override obj2=new Override();
        obj2.check(); 
    }
    
}

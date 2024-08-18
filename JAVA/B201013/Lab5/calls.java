/*3. Write a JAVA program for the following
a. Call by value
b. Call by object */

class CallBY_value{
    int show(int a){
        return a;
    }
}

class CallBy_object{
    int a;
    CallBy_object(int num){
        a=num;
    }

    
}
public class calls {
    public static void main(String args[]){
        CallBY_value obj=new CallBY_value();
        CallBy_object obj2=new CallBy_object(10);
        System.out.println(obj.show(5)+" Call by value");
        System.out.println(obj2.a+" Call By object ");
    }
}

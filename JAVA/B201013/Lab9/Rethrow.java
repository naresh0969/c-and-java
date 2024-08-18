/*3. Write a program to rethrow an exception – Define methods one() & two(). Method two()
should initially throw an exception. Method one() should call two(), catch the exception
and rethrow it Call one() from main() and catch the rethrown */
package Lab9;

class First {
    public void method2() throws Exception{
        throw new Exception("from method2");
    }
    public void method1()throws Exception{
        method2();
    }
}
public class Rethrow {
    public static void main(String args[]){
        First obj=new First();
        try{
            obj.method1();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}

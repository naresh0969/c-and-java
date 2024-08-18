/*4. Exception Handling program for ClassNotFoundException--thrown if a program can not
find a class it depends at runtime (i.e., the class's ".class" file cannot be found or was
removed from the CLASSPATH). */
package Lab9;

public class NotFound {
    public static void main(String args[]){
        try{
            Class.forName("aniketh bochugadu");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }

    }
}

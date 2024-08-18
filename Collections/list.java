import java.util.ArrayList;
import java.util.Collections;
/*add()
 *remove()
 *contains()
 *size()
 *isEmpty()
 *clear()
 *set();
 */
public class list{
    public static void main(String args[]){
        //list declaration.
        ArrayList <Object> lst=new ArrayList<>();
        ArrayList <Integer> lst2=new ArrayList<>();
        lst.add(2);
        lst.add(34);
        lst.add(6);
        lst.add("naresh");
        lst2.add(4);
        lst2.add(2);
        lst2.add(6);
        lst2.add(1);
        lst2.add(9);
        

        // lst.remove(2);
        lst.set(2,1);

        //printing by iterating method
        for(Object ele : lst){
            System.out.println(ele);
        }

        System.out.println(lst);
        //accessing the elements using index values;
        System.out.println("at index 3:"+lst.get(3));
        Object var=lst.get(3);

        String var2=(String)lst.get(3);
        System.out.println(var+" "+var2.charAt(2));
//sorting
        Collections.sort(lst2);
        System.out.println("Acending order"+lst2);
        Collections.sort(lst2,Collections.reverseOrder());
        System.out.println("Reverse order"+lst2);

        System.out.println("contains "+lst2.contains(5));
        System.out.println("Size"+ lst2.size());
        System.out.println(lst2.isEmpty());
        lst2.clear();
        System.out.println(lst2);


    }
}
import java.util.ArrayList;
import java.util.Collection;
public  class index{
    public static void main(String arg[]){
//creating a ArrayList
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<>();
//adding elements
        System.out.println("size: "+list.size());

        list.add(4);
        list.add(5);
        list.add(11);
        list.add(20);
        list.add(35);
        list.add(5);
        list.add(20);
        list2.add(10);
        System.out.println(list);
//set()
        list.set(1,10);
//get()
        list.get(2);
//addAll()
        list2.addAll(list);
        System.out.println(list2);
//contains()
        System.out.println(list.contains(4));
//indexOf()
        System.out.println(list.indexOf(11));
//lastIndexOf()
        System.out.println(list.lastIndexOf(5));
//remove()
        list.remove(4);
//removeIf()
        list.removeIf(num->num%2==0);
        System.out.println("RemoveIf :"+ list);
//subList()
        System.out.println("list2 :"+list2);
        ArrayList<Integer>subList=new ArrayList<>(list2.subList(1,5));
        System.out.println("list2 SubList :"+subList);
//ArrayList->Array
        System.out.println("ArrayList->Array");
        Integer arr[]= list2.toArray(new Integer[0]);

        for(int i:arr){
            System.out.println(i);
        }
//Array->List
        


    }
}
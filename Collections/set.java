/*
 * Set->HashSet,LinkedHashSet,TreeSet
 * 
 * add()
 * remove()
 * contains()
 * isEmpty()
 * size()
 * clear()
 * 
 * 
 */

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class set {
    public static void main(String args[]){
        //set declartion
        Set<Integer> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        Set<String>linked=new LinkedHashSet<>();
        Set<String>tree=new TreeSet<>(Comparator.reverseOrder());
        set1.add(2);
        set1.add(1);
        set1.add(7);
        set1.add(10);
        set1.add(6);
        System.out.println(set1.contains(6));
        System.out.println("Hashset:"+set1);

        set2.add("apple");
        set2.add("zebra");
        set2.add("ball");
        System.out.println("Hashset2 :"+set2);

        linked.add("apple");
        linked.add("zebra");
        linked.add("ball");
        System.out.println("linked :"+linked);

        tree.add("apple");
        tree.add("zebra");
        tree.add("ball");
        System.out.println("tree :"+tree);

    }
}

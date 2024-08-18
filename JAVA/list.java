import java.util.ArrayList;
import java.util.*;
public class list {
    public static void main(String args[]){
//intialisation
        List <Integer>nums=new ArrayList<Integer>();
        List <Integer> nums2=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(nums2);
        System.out.println("size 1:"+nums.size());
//adding elements
        nums.add(2);
        nums.add(9);
        nums.add(89);
        nums.add(1,90);
        nums.addAll(2,nums);
        System.out.println("size :"+nums.size());
        System.out.println(nums);
        System.out.println(nums.get(1));
        System.out.println(nums.indexOf(2));

        System.out.println(nums.lastIndexOf(89));
        nums.set(0, 10);
//sorting
        Collections.sort(nums);
        System.out.println("sorted "+nums);
        // System.out.println(nums);
        // nums.sort(null);


//removing elements
        System.out.println(nums);
        nums.remove(0);
        System.out.println(nums);
        nums.removeFirst();
        System.out.println(nums);
        nums.removeAll(nums);
        System.out.println(nums);
        System.out.println(nums.contains(100));



        // System.out.println(nums);
        // for(int n:nums){
        //     System.out.println(n);
        // }
    }

}

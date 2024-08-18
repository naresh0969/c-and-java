package List;
import java.util.*;
public class list_demo {
    public static void main(String args[]){
        //List declaration

        //Method 1(empty list)
        List<Integer>num1=new ArrayList<>();
        System.out.println("First list "+num1);
        //Method 2 (non empty list)
        List<Integer>nums=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        //display

        //method 2
        System.out.println(nums);
        //method 2
        for(int i :nums){
            System.out.print(i+" ");
        }
        System.out.println();


        //insertion
        nums.add(10);
        nums.add(1,25);
        System.out.println(nums);
        nums.set(2,100);
        System.out.println(nums);


        //remove
        nums.remove(2);
        nums.removeFirst();
        num1.removeAll(num1);
        System.out.println(num1);

        //search
        System.out.println(nums.contains(2)); //says if 2 is present or not in the list.

        //indexof
        System.out.println(nums.indexOf(100));

        //sorting
        System.out.print("Acending order :");
        Collections.sort(nums);
        System.out.println(nums);
            //in decending order
        System.out.print("Decending order:");
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums);

        //list in array
            //method 1
        Integer[] numbersArray = nums.toArray(new Integer[nums.size()]);
        for(int i=0;i<numbersArray.length;i++){
            System.out.print(numbersArray[i]+" ");
        }

            //method 2
        Object[] arr=nums.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("array :"+arr);

        //array into list
        Integer[] numberArray = {1, 2, 3, 4, 5};
        for(int n:numberArray){
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("converted into list");
        List<Integer> numbersList = Arrays.asList(numbersArray);
        for(int n:numbersList){
            System.out.print(n+" ");
        }

        System.out.println();

    }
}

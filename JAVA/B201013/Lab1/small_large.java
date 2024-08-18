
import java.util.Scanner;
import java.util.Arrays;
public class small_large {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int size;
        System.out.print("Enter Size :");
        size=scan.nextInt();

        int[] arr= new int[size];
        System.out.println("enter values");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Small : "+arr[0]);
        // System.out.println(arr[0]);
        System.out.println("Large : "+arr[size-1]);
        //System.out.println(arr[size-1]);
        scan.close();
        

    }
}

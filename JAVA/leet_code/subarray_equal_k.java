package leet_code;
import java.util.*;
class ksum{
    int kcount(int array[],int key){
        int count=0;
        int currsum=0;
        for(int i=0;i<array.length;i++){
            currsum=array[i];
            if(currsum==key) count++;
            for(int j=i+1;j<array.length;j++){
                currsum+=array[j];
                if(currsum==key) count++;
            }
            currsum=0;
        }
        return count;

    }
}
public class subarray_equal_k {
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int size,key;

        System.out.print("Enter size:");;
        size=scan.nextInt();
        int []array=new int[size];
        System.out.print("Enter numbers :");
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        System.out.println("Enter key value :");
        key=scan.nextInt();
        ksum obj=new ksum();
        int result=obj.kcount(array,key);
        System.out.println("Count="+result);
        scan.close();

    }
}

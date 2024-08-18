package leet_code;
import java.util.*;
class monotonicM{

    public boolean isMonotonic(int[] A) {
        int i = 1;
        for(; i < A.length; i++)
            if(A[i - 1] > A[i]) break;
        if(i != A.length)
            for(i = A.length-2; i > -1; i--)
                if(A[i + 1] > A[i]) return false;
        return true;

}
}
public class monotonic {

    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int size;
        System.out.println("Enter size :");
        size=scan.nextInt();
        int []array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }

        scan.close();

    }
}

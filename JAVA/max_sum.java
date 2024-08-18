
class array_sum{
    public static void max_subarray(int array[]){
        int prefix[]=new int[array.length];
        prefix[0]=array[0];
        for(int i=1;i<array.length;i++){
            prefix[i]=prefix[i-1]+array[i];
        }
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                currsum=i==0? prefix[j]:prefix[j]-prefix[i-1];
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
            
        }
        System.out.println("Max sum ="+maxsum);

    }
}
public class max_sum {
    public static void main(String args[]){
        int array[]={3,5,2,-1,-2};
        array_sum.max_subarray(array);

    }
}

package leet_code;
import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result=0;
        int m=nums1.length;
        int n=nums2.length;
        double temp[]=new double[m+n];
        int i=0;
        for(int k=0;k<m;k++){
            temp[i++]=nums1[k];
        }
        for(int k=0;k<n;k++){
            temp[i++]=nums2[k];
        }
        Arrays.sort(temp);
        int total=temp.length;
        //odd size
        if(total%2==1){
            result=(double)temp[total/2];
        }
        //even size
        else{
            double first_mid=(double)temp[total/2-1];
            double second_mid=(double)temp[total/2];
            result=(first_mid+second_mid)/2.0;
        }
        return result;
        
    }
}
public class sorted_mid {
    
}

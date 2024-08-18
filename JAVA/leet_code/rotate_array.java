// package leet_code;
// import java.util.*;

// class Solution {
//     public void rotate(int[] nums, int k) {
//         int size=nums.length;
//         Collections.reverse(Arrays.asList(nums));
//         reverse(nums,0,k);
//         reverse(nums,k,size);
//         for(int n:nums){
//             System.out.print(n+" ");
//         }
        
//     }
//    public void reverse(int []nums,int j,int k){
//         int x=j;
//         int y=k-1;
//         for(int i=0;i<(y-j)/2;i++){
//             int temp=nums[x];
//             nums[x]=nums[y];
//             nums[y]=temp;
//             x++;
//             y--;
//         }
        
//     }
// }
// public class rotate_array {
//     public static void main(String args[]){
//         Scanner scan=new Scanner(System.in);
//         int size=scan.nextInt();
//         int []arr=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=scan.nextInt();
//         }
//         //System.out.print("moves :");
//         // int k=scan.nextInt();
//         Solution sol=new Solution();
//         sol.reverse(arr,0, size);

//         //sol.rotate(arr, k);
//         Collections.reverse(Arrays.asList(arr));
//         for(int n:arr){
//             System.out.print(n+" ");
//         }
//         scan.close();

//     }
// }


class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        RotateArray solution = new RotateArray();
        solution.rotate(arr, k);
    }
}
    //     int size=nums.length;
    //     k%=size;
    //     reverse(nums,0,size-1);
    //     reverse(nums,0,k-1);
    //     reverse(nums,k,size-1);
    //     for(int n:nums){
    //         System.out.print(n+" ");
    //     }
        
    // }
    // void reverse(int []nums,int start,int end){
    //     while(start<end){
    //         int temp=nums[start];
    //         nums[start]=nums[end];
    //         nums[end]=temp;
    //         start++;
    //         end--;
    //     }
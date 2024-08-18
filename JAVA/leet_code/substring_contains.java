package leet_code;
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        else{
            return -1;
        }
        
    }
}
public class substring_contains {
    public static void main(String args[]){
        Solution sol=new Solution();
        int num=sol.strStr("sadbutsad", "sad");
        System.out.println(num);
    }
}

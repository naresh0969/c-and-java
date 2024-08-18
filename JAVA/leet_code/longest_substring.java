package leet_code;
 import java.util.*;

class Solution {
    int maxLen = 0;
    int lo = 0;
    public String longestPalindrome(String s) {
        if(s.length() < 2) {
            return s;
        }
        
        for(int i = 0; i<s.length(); i++) {
            expandPalindrome(s, i, i);
            expandPalindrome(s, i, i+1);
        }
        return s.substring(lo, lo+maxLen);
    }
    
    public void expandPalindrome(String s, int j, int k) {
        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if(maxLen < k - j - 1) {
            maxLen = k - j - 1;
            lo = j+1;
        }
    }
}
public class longest_substring {
    public static void main(String args[]){
        String str;
        Scanner scan=new Scanner(System.in);
      
        str=scan.next();
        Solution sol=new Solution();
        String ans=sol.longestPalindrome(str);
        System.out.println(ans);
        scan.close();
    }
}


import java.util.*;
class Solution {
    public String longestPalindrome(String s) {
        int size1=0,size2;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                size2=palinCheck(s.substring(i,j));
                if(size2>size1){
                    size1=size2;
                }

            }
        }
        return "";
        
    }

    int palinCheck(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return 0;
            }
        }
        return str.length();
    }
}
class aleet{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        Solution sol=new Solution();
        String ways=sol.longestPalindrome(s);
        System.out.println(ways);;
        scan.close();
    }
}
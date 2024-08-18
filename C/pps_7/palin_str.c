// C program to check a string is palindrome or not
#include<stdio.h>
#include<string.h>
int main(){
    char str[50],len,val;
    printf("Enter Word :");
    scanf("%s",&str);
    len=strlen(str);
    for(int i=0;i<len;i++){
        if(str[i]!=str[len-i-1]){
            val=1;
            break;
        }
    }
    if(val==1){
        printf("Not Palindrome ..");
    }
    else{
        printf("Palindrome.");
    }

}
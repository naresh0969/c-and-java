//Write a C program to check the given number is palindrome.
#include<stdio.h>
int main(){
    int num,rev=0,r,original;
    printf("Enter a number :");
    scanf("%d",&num);
    original=num;
    while(num!=0){
        r=num%10;
        rev=(rev*10)+r;
        num=num/10;
        
    }
    if(original==rev){
        printf("%d is a palindrome ",original);
    }
    else{
       printf("%d is not a palindrome ",original); 
    }

    
       
}
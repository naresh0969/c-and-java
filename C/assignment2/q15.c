//15.Write a C program to check whether a number is palindrome or not.
#include<stdio.h>
int main(){
    int num,rev=0,rem,dup;
    printf("Enter Number :");
    scanf("%d",&num);
    dup=num;
    for(int i=0;num!=0;i++){
        rem=num%10;
        rev=(rev*10)+rem;
        num/=10;
    }
    if(dup==rev){
        printf("Palindrome");
    }
    else{
        printf(" Not a Palindrome");
    }
    return(0);
}
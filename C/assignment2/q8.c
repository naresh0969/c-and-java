//8.Write a C program to enter 3-digit number and print its reverse.
#include<stdio.h>
int main(){
    int num,rem,rev=0;
    printf("Enter a number :");
    scanf("%d",&num);
    for(int i=0;num!=0;i++){
        rem=num%10;
        rev=rev*10+rem;
        num/=10;
    }
    printf("After reversed :%d",rev);
    return(0);
}
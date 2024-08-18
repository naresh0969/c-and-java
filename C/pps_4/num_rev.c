//c program to reverse given number.
#include<stdio.h>
void main(){
    int num,rev=0;
    printf("Enter number :");
    scanf("%d",&num);
    for(int i=0;num!=0;i++){
        rev=(rev*10)+num%10;
        num/=10;
    }
    printf("%d",rev);
}
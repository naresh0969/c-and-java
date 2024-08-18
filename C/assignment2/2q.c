//2Q Write a C program to check whether a year is leap year or not.
#include<stdio.h>
int main(){
    int  num;
    printf("Enter year :");
    scanf("%d",&num);
    if((num%4==0 || num%400==0)&&(num%100!=0)){
        printf("It's a leap year..!");
    }
    else{
        printf("Not a leap year ");
    }
}
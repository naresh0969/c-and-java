//Write a c program to check given number is prime number or not.
#include<stdio.h>
void main(){
    int num,count=0;
    printf("Enter number :");
    scanf("%d",&num);
    for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
    if(count==2){
        printf("Prime number ");
    }
    else{
        printf("Not Prime number");
    }
}
//Write a C program to check the given number is prime number.
#include<stdio.h>
int main(){
    int num,count=0;
    printf("Enter a number:");
    scanf("%d",&num);
    for (int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
    if(count==2){
        printf("%d is a prime nnumber ",num);
    }
    else{
        printf("%d is not a prime nnumber ",num);
    }
}
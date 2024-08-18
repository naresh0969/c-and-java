//10.Write a C program to calculate factorial of a number.
#include<stdio.h>
int main(){
    int num,fact=1;
    printf("Enter a number :");
    scanf("%d",&num);
    for(int i=1;i<=num;i++){
        fact*=i;
    }
    if(num==0){
        printf("0 Factorial is :1");
    }
    else{
        printf("Factorial of %d is :%d",num,fact);
    }
    

    return(0);
}
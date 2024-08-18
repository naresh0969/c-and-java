//14.Write a C program to find LCM and GCD of two numbers.
#include<stdio.h>
int main(){
    int num1,num2,gcd,lcm;
    printf("Enter 1st number :");
    scanf("%d",&num1);
    printf("Enter 2st number :");
    scanf("%d",&num2);
    for(int i=1;(i<=num1)&&(i<=num2);i++){
        if((num1%i==0)&&(num2%i==0)){
            gcd=i;
        }
    }
    lcm=(num1*num2)/gcd;
    printf("The LCM of %d,%d is :%d\n",num1,num2,lcm);
    printf("The GCD of %d,%d is : %d",num1,num2,gcd);
    
}
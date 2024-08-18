//2Q. c program to find the GCD of user given two numbers using recursion.
#include<stdio.h>
int gcd(int a,int b);
int main(){
    int num1,num2,res;
    printf("Enter 1st number :");
    scanf("%d",&num1);
    printf("Enter 2nd number :");
    scanf("%d",&num2);
    res=gcd(num1,num2);
    printf("%d\n",res);
}
int gcd(int a,int b){
    int r;
    r=b%a;
    if(r==0){
        return(a);
    }
    else{
        gcd(r,a);
    }
    
}

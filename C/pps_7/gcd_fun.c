//2Q. c program to find the GCD of user given two numbers.
#include<stdio.h>
void gcd(int a,int b);
int main(){
    int num1,num2;
    printf("Enter 1st number :");
    scanf("%d",&num1);
    printf("Enter 2nd number :");
    scanf("%d",&num2);
    gcd(num1,num2);
}
void gcd(int a,int b){
    int res=1,t;
    (a>b)?t=a,a=b,b=t:a;
    for(int i=1;i<=a;i++){
        if(a%i==0 && b%i==0){
            
            res=i;
        }
    }
    printf("GCD is %d",res);
}
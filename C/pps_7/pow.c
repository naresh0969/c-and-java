//3Q c program to find the n exponent value of a number.
#include<stdio.h>
int power(int a,int b);
int main(){
    int base,exp;
    printf("Enter base :");
    scanf("%d",&base);
    printf("Enter exponent :");
    scanf("%d",&exp);
    power(base,exp);
}
int power(int a,int b){
    int res=1;
    for(int i=1;i<=b;i++){
        res*=a;
    }
    printf("%d Power %d is %d ",a,b,res);
}
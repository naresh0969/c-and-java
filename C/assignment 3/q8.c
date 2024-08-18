//Q8 Write a C program to calculate the power of any number using recursion.
#include<stdio.h>
int result(int x,int y);
void main(){
    int num,exp,pow;
    printf("Enter number :");
    scanf("%d",&num);
    printf("Enter exponent :");
    scanf("%d",&exp);
    pow=result(num,exp);
    printf("%d",pow);
}
int result(int x,int y){
    int num;
    if(y==1){
        return(x);
    }
    else{
        num=x*result(x,y-1);
        return(num);
    }
}
#include<stdio.h>
//declaration
int sum(int a,int b);

int main(){
    int a,b,s;
    printf("Enter first number :");
    scanf("%d",&a);
    printf("Enter second number :");
    scanf("%d",&b);
    s=sum(a,b);
    printf("the sum is :%d",s);


    return(0);
}
int sum(int a,int b){
    return a+b;
}
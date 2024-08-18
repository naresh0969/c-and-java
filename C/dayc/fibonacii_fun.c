// C program to print sequence of fibonacii series by using recurssion.
#include<stdio.h>
int fib(int a);
int main(){
    int num;
    printf("Enter range :");
    scanf("%d",&num);
    for(int i=0;i<num;i++){
        printf("%d ",fib(i));
    }
}
int fib(int a){
    if(a==0){
        return(0);
    }
    else if(a==1){
        return(1);
    }
    else{
        return(fib(a-1)+fib(a-2));
    }
}
// 4Q. write c program to print factorial of a number using recursion.
#include<stdio.h>
int fact(int a);
void main(){
    int num,res;
    printf("Enter number :");
    scanf("%d",&num);
    res=fact(num);
    printf("%d",res);
}
int fact(int a){
    if(a==1){
        return(1);
    }
    else{
        return(a*fact(a-1));
    }
}
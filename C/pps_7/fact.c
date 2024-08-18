// 1Q. write c program to print factorial of a number using function.
#include<stdio.h>
int fact(int a);
int main(){
    int num;
    printf("Enter the number :");
    scanf("%d",&num);
    fact(num);
}
int fact(int a){
    int res=1;
    for(int i=1;i<=a;i++){
        res*=i;
    }
    printf("%d",res);
}
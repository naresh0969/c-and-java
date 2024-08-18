// C program to print the power of user entered number using recursion.
#include<stdio.h>
int power(int a,int b);
int main(){
    int num,exp,result;
    printf("Enter number :");
    scanf("%d",&num);
    printf("Enter exponent :");
    scanf("%d",&exp);
    result=power(num,exp);
    printf("%d",result);
}int power(int a,int b){
    if(b==1){
        return(a);
    }
    else{
        return(a*power(a,b-1));
    }
}
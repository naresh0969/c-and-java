#include<stdio.h>
int main(){
    int num,result;
    printf("Enter any number :");
    scanf("%d",&num);
    result=(num*(num+1))/2;
    printf("The sum of %d natural numbers is %d",num,result);
    return(0);
}
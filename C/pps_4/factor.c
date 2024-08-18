//C program to print factoriol of given number.
#include<stdio.h>
void main(){
    int num,fact=1;
    printf("Enter number :");
    scanf("%d",&num);
    for(num;num!=0;num--){
        fact*=num;
        

    }
    printf("%d",fact);
}
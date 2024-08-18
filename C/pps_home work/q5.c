//Write a C program to count the number of factors of a given number.
#include<stdio.h>
int main(){
    int num,count=0;
    printf("Enter any number :");
    scanf("%d",&num);
    for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
    printf("No. of factors :%d",count);
}


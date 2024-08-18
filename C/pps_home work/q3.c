//write a C program to find the sum of individual digits of a given number.
#include<stdio.h>
int main(){
    int num,sum=0;
    printf("Enter a number :");
    scanf("%d",&num);
    for(int i=0;;i++){
        sum+=num%10;
        num=num/10;
        if(num>=0 && num<=9){
            sum+=num;
            break;
        }
    }
    printf("The sum of individual numbers :%d",sum);
    }
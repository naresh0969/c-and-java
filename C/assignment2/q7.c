//7. Write a C program to calculate sum of the digits of a number. Eg if entered number is 123 the output should be 6.
#include<stdio.h>
int main(){
    int num,sum=0;
    printf("Enter a number :");
    scanf("%d",&num);
    for(int i=1;num!=0;i++){
        sum+=num%10;
        num/=10;
    }
    printf("The sum of number is %d",sum);
    return(0);
}
#include<stdio.h>
void main(){
    int num,sum;
    printf("Enter number :");
    scanf("%d",&num);
    for(int i=0;num!=0;i++){
        sum+=num%10;
        num/=10;
    }
    printf("Sum is =%d",sum);
}
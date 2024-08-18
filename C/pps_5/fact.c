// c program to count factors of a given number.
#include<stdio.h>
void main(){
    int num,count;
    printf("Enter number :");
    scanf("%d",&num);
    for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }

    }
    printf("Factors count :%d",count);
}
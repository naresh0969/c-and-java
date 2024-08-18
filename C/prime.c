//wite a c program to check weither entered number is prime are not
#include<stdio.h>
int main(){
    int num,count=0;
    printf("Enter a number :");
    scanf("%d",&num);
    for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }    
    }
    if(count==2){
            printf("%d is a prime number.",num);
    }
    else{
        printf("%d is not a prime number.",num);
    }

    return(0);
}
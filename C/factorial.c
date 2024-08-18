#include<stdio.h>
//Factorial of a given number.
int fact(int n);

int main(){
    printf("Enter a number :");
    int num;
    scanf("%d",&num);
    printf("The %d factorial is : %d",num,fact(num));
    
    return(0);
}
int fact(int n){
    if(n==1){
        return 1;
    }
    else{
        return n*fact(n-1);
    }
    }


    
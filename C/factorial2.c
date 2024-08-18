//finding the factorial of a given number
#include<stdio.h>
int fact(int num);
int main(){
    printf("Enter a number :");
    int num;
    scanf("%d",&num);
    printf("%d",fact(num));
}
int fact(int num){
    if(num==1){
        return 1;
    }
    else{
        return num*fact(num-1);
    }
}
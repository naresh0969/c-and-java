#include<stdio.h>
void main(){
    int num,sum=0,dup;
    printf("Enter a number :");
    scanf("%d",&num);
    dup=num;
    for(int i=0;dup!=0;i++){
        sum=(sum*10)+dup%10;
        dup/=10;
    }
    if(sum==num){
        printf("palindrome");
    }
    else{
        printf("not palindrome");
    }
}
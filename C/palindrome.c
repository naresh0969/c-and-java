//write a c program to check a number is palindrome are not
//ex 121,3663 are palindrome
#include<stdio.h>
int main(){
    int num,dn,sum=0,r;
    printf("Enter a Number :");
    scanf("%d",&num);
    dn=num;
    while(num!=0){
        r=num%10;
        sum=(sum*10)+r;
        num/=10;
    }
    if(dn==sum){
        printf("it's Palindrome");
    }
    else{
        printf("It's not Palindrome");
    }
    return(0);
}
#include<stdio.h>
int gcd(int a,int b);
void main(){
    int num1,num2,res;
    printf("Enter 1st no. :");
    scanf("%d",&num1);
    printf("Enter 2st no. :");
    scanf("%d",&num2);
    res=gcd(num1,num2);
    printf("GCD is %d",res);
}
int gcd(int a,int b){
    int gcd;
    for(int i=1;i<=a;i++){
        if(a%i==0&&b%i==0){
            gcd=i;
        }
    }
    return(gcd);
}
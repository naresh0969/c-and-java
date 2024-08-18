//c program to print the n power m value using recursion.
#include<stdio.h>
int power(int a,int b);
int main(){
    int base,exp,res;
    printf("Enter base :");
    scanf("%d",&base);
    printf("Enter exponent :");
    scanf("%d",&exp);
    res=power(base,exp);
    printf("%d",res);
}
int power(int a,int b){
    if(b==1){
        return(a);
    }
    else{
        return(a*power(a,b-1));
    }
}
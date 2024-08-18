#include<stdio.h>
int main(){
    int num,fac=1;
    printf("Enter any number :");
    scanf("%d",&num);
    for(num;num>1;num--){
        fac=fac*num;
    }
    printf("the factorial of %d is %d",num,fac);
    return(0);
}
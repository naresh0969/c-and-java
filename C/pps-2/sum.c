//finding sum of n natural numbers
#include<stdio.h>
int main(){
    int a,b;
    printf("enter any natural number:");
    scanf("%d",&a);
    b=(a*(a+1)/2);
    printf("the sum of %d numders is %d",a,b);
    return 0;
}
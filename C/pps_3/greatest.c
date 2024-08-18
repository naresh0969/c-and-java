//find greatest number
#include<stdio.h>
int main(){
    int a,b,c;
    printf(" enter any number :");
    scanf("%d",&a);
    printf(" enter another number :");
    scanf("%d",&b);
    printf(" enter one more  :");
    scanf("%d",&c);
    if(a>b && a>c){
        printf("%d is greatest /n",a);
    }
    if(b>a && b>c){
        printf("%d is greatest /n",b);
    }
    else{
        printf("%d is greatest ",c);
    }
    return(0);
}
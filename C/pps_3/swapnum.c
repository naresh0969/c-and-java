// swap the two numbers using third variable
#include<stdio.h>
int main(){
    int a,b,swap;
    printf("enter any number :");
    scanf("%d",&a);
    printf("enter another number :");
    scanf("%d",&b);
    printf("before swap : %d,%d \n",a,b);
    swap=a;
    a=b;
    b=swap;
    printf("after swap : %d ,%d \n",a,b);

    //swaping without using third variable
    printf(" without using third variable /n");
    int c=5,d=8;
    printf("before swap %d , %d \n",c,d);
    c=c*d;
    d=c/d;
    c=c/d;
    printf("after swap %d , %d \n",c,d);
    return(0);

}
//Q1 ; Read two integers a,b.

#include<stdio.h>
#include<math.h>
int main(){
    int num1,num2;
    printf("enter any a number :");
    scanf("%d",&num1);
    printf("enter any another number :");
    scanf("%d",&num2);
    
    printf("sub of %d and %d is %d \n",num1,num2,num1-num2);
    printf("multiplication of %d and %d is %d \n ",num1,num2,num1*num2);
    printf("div of %d and %d is %d \n",num1,num2,num1/num2);
    printf("remainder of %d and %d is %d \n",num1,num2,num1%num2);

    return(0);
    

}


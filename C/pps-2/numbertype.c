//to check positive or negative or even or odd.
#include<stdio.h>
int main(){
    int a;
    printf("enter any number :");
    scanf("%d",&a);
    if(a>0){
        printf("%d is a positive number \n ",a);
    }
    else if(a<0){
        printf("%d is a negative number \n ",a);
    }
    else{
        printf("you entered zero \n");
    }
    // for even or odd
    if(a%2==0){
        printf("%d is a even number \n ",a);
    }
    else{
        printf("%d is a odd number \n",a);
    }
    return 0;
}
#include<stdio.h>
#include<math.h>
int main(){
    int num;
    printf("Enter any number :");
    scanf("%d",&num);
    printf("The power of %d is %f",num,pow(num,2));
    return(0);

}
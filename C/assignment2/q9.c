//9.Write a C programto find the all factors of a number.
#include<stdio.h>
int main(){
    int num;
    printf("Enter Number :");
    scanf("%d",&num);
    printf("The factors of %d are :",num);
    for(int i=1;i<=num;i++){
        if(num%i==0){
            printf("%d ",i);
        }
    }
    return(0);
}
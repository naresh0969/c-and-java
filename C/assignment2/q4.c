//4Q Write a C program to input month number and print number of days in that month.
#include<stdio.h>
int main(){
    int num;
    printf("Enter month number :");
    scanf("%d",&num);
    if(num==1||num==3||num==5||num==7||num==8||num==10||num==12){
        printf("31 Days");
    }
    else if(num==4||num==6||num==9||num==11){
        printf("30 Days");
    }
    else{
        printf("28/29 days");
    }
    return(0);
}
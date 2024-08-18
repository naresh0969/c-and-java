//Q1 : check weither user entered digit or character
#include<stdio.h>
int main(){
    int num;
    printf("Enter character/number :");
    scanf("%c",&num);
    if(num>='0' && num<='9'){
        printf("you entered number");

    }
    else{
        printf("You entered a character ");
    }
    return(0);
}
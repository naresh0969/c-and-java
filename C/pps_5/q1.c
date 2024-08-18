#include<stdio.h>
int main(){
    float num;
    printf("Enter your Marks(%) :");
    scanf("%f",&num);
    if(num<40){
        printf("Fail");
    }
    else if(num>=40 && num<=60){
        printf("second");
    }
    else if(num>60 && num<=80){
        printf("First");
    }
    else if(num>80 && num<=100){
        printf("Distinction");
    }
}
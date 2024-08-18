/*6Q Write a C program that asks user to enter a number between 1 and 7 . The program should print the  corresponding day of the week(Monday 
for 1,tuesday etc. using switch case)*/
#include<stdio.h>
int main(){
    int num;
    printf("Enter a Number(1-7) :");
    scanf("%d",&num);
    switch (num)
    {
    case 1:
        printf("Monday");
        break;
    case 2:
        printf("Tuesday");
        break;
    case 3:
        printf("Wednasday");
        break;
    case 4:
        printf("Thursday");
        break;
    case 5:
        printf("Friday");
        break;
    case 6:
        printf("Saturday");
        break;
    case 7:
        printf("Saturday");
        break;
    
    default:
        printf("Invalid Number!");
        break;
    }

}
//Q3: write a c program to convert celcius to ferenhit
//formula is (0°C × 9/5) + 32 = 32°F

#include<stdio.h>
int main(){
    printf("Enyer the temperature in celsius :");
    int temp1,temp2;
    scanf("%d",&temp1);
    temp2=((temp1*9/5)+32);
    printf("The ferenheit temperature is %d",temp2);
    return(0);

}
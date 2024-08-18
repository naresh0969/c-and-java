/* 5Q Write a C program to input electricity unit charges and calculate total electricity bill according to given condition.
For 50 units Rs 0.50/unit
For next 100 units Rs 0.75/unit
For next 100 units Rs 1.20/unit
For unit above 250 units Rs 1.5/unit
An additional surcharges of 20% is added to the bill*/

#include<stdio.h>
int main(){
    float unit,amount,surcharge,bill;
    printf("Enter Units of Electricity :");
    scanf("%f",&unit);
    if(unit<=50){
        amount=unit*0.5;
    }
    else if(unit>50 && unit<=150){
        amount=unit*0.75;
    }
    else if(unit>150 && unit<=250){
        amount=unit*1.20;
    }
    else if(unit>250){
        amount=unit*1.5;
    }
    surcharge=(amount/100)*20;
    bill=surcharge+amount;
    printf("Bill =%.2f\n",bill);
    printf("*with addition of surcharge %.2f",surcharge);
    return(0);
}
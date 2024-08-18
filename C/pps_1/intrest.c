//calculatig intrest
#include<stdio.h>
#include<math.h>
int main(){
    int principle;
    float total_intrest,intrest_rate,time,CI;
    printf("enter principle amount :");
    scanf("%d",&principle);
    printf("enter intrest rate :");
    scanf("%f",&intrest_rate);
    printf("time period of time (year) :");
    scanf("%f",&time);
    total_intrest=(principle*time*intrest_rate)/100;
    printf("total intrest is %f \n ",total_intrest);
    CI=principle*pow((1+(intrest_rate/100)),time);
    printf("coumpound intrest is %f ",CI);
    return(0);



}
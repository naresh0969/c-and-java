// write a functio to convert the temperature from celsius into fahrenheit.
#include<stdio.h>
float temp(float x);
int main(){
    printf("Enter temperature in celsius :");
    float cel;
    scanf("%f",&cel);
    temp(cel);
    return(0);
}
float temp(float x){
    float fah=(x*9.0/5.0)+32;
    printf("%f in fahrenheit is %f:",x,fah);
    return(0);
}
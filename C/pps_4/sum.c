//write a c program to print sum of first 100 odd and even numbers ?
#include<stdio.h>
void main(){
    int esum,osum;
    for(int i=1;i<=100;i++){
        if(i%2==0){
            esum+=i;
        }
        else{
            osum+=i;
        }

    }
    printf("even sum =%d\n",esum);
    printf("odd sum =%d",osum);
}
//write c program to generate all the prime numbers between 1 and n ,where n is is a value.
#include<stdio.h>
void main(){
    int num,count=0;
    printf("Enter range");
    scanf("%d",&num);
    for(int i=1;i<=num;i++){
        for(int j=1;j<=i;j++){
            if(i%j==0){
                count++;
            }
        }
        if(count==2){
            printf("%d ",i);
        }
        count=0;
    }
}
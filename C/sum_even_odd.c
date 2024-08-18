//write a c program to sum of fist 100 odd numbers and first 100 even

#include<stdio.h>
int main(){
    int sum1=0,sum2=0;
    for(int i=1;i<=200;i++){
        if(i%2==0){
            sum1+=i;
        }
        else{
            sum2+=i;
        }
        
    }
    printf("%d\n",sum1);
    printf("%d",sum2);
    
    return(0);
}

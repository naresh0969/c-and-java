#include<stdio.h>
int main(){
    int num,i,arry[10];
    printf("Enter a number :");
    scanf("%d",&num);
    for(i=0;num!=0;i++){
        arry[i]=num%2;
        num=num/2;

    }
    for(i=i-1;i>=0;i--){
        printf("%d",arry[i]);
    }
    return(0);

}
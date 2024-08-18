//Converting decimal number into binary

#include<stdio.h>
int main(){
    int num,i;
    printf("Enter a number:");
    scanf("%d",&num);
    int arr[10];
    for(i=0;num>0;i++){
        arr[i]=num%2;
        num/=2;
    }
    for(i;i>=0;i--){
        printf("%d",arr[i]);
    }
    return(0);

    
}
#include<stdio.h>
void main(){
    int arr[5],sum=0;
    int *ptr=arr;
    for(int i=0;i<5;i++){
        scanf("%d",&ptr[i]);
        sum+=ptr[i];
    }
    for(int i=4;i>=0;i--){
        printf("%d",ptr[i]);
    }
    printf("\n%d sum :",sum);
}
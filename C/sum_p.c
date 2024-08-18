#include<stdio.h>
void main(){
    int size,sum=0;
    printf("Enter size of array:");
    scanf("%d",&size);
    int arr[size],*p;
    p=arr;
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
        sum+=*p;
    }
    printf("%d",sum);

}
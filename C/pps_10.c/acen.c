//Write c program that implements Bubble sort method to sort given list of integers in ascending order.
#include<stdio.h>
void main(){
    int size,arr[20],i,temp;
    printf("how many numbers want to enter ?");
    scanf("%d",&size);
    for(i=1;i<=size;i++){
        scanf("%d",&arr[i]);
    }
    for(i=1;i<=size;i++){
        for(int j=1+i;j<=size;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(i=1;i<=size;i++){
        printf("%d ",arr[i]);
    }


}
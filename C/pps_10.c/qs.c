
/*Write a C program that uses non-recursive function to search for a integers using binary search method*/
#include<stdio.h>
void sort(int arr[],int size){
    int i,j,small,temp;
    for(i=0;i<size;i++){
        small=i;
        for(j=i+1;j<size;j++){
            if(arr[j]<arr[small]){
                small=j;
            }
        }
        temp=arr[small];
        arr[small]=arr[i];
        arr[i]=temp;
    }
}
void res(int arr[],int size){
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
}
void main(){
    int size;
    printf("No. of values :");
    scanf("%d",&size);
    int arr[size];
    printf("Enter values :");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    sort(arr,size);
    res(arr,size);
}
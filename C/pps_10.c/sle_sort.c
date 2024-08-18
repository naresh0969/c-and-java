//Write a c program that sorts the given array of integers using selection sort.
#include<stdio.h>
void sort(int arr[],int size){
    int small,j,i,temp;
    for(int i=0;i<size;i++){
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
void res(int arr[],int a){
    for(int i=0;i<a;i++){
        printf("%d ",arr[i]);
    }
}
void main(){
    int size;
    printf("No. of elements? ");
    scanf("%d",&size);
    int arr[size];
    printf("Enter values :");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    sort(arr,size);
    res(arr,size);
}
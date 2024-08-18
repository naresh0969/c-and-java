//Write a c program for reading elements using pointers into array and display the values using array.
#include<stdio.h>
void main(){
    int arr[5];
    int *p=arr;
    for(int i=0;i<5;i++){
        scanf("%d",p+i);
    }
    for(int i=5;i>0;i--){
        printf("%d",p+i);
    }
}
//Write a program to search a key value in a sorted list by using binory method with recursion.
#include<stdio.h>
int size,arr[20],search;
void sort(int fn,int ln);
void main(){
    printf("How many values? ");
    scanf("%d",&size);
    
    printf("ENTER VALUES:");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    printf("Number to search :");
    scanf("%d",&search);
    int fn=0,ln=size-1,mn;
    sort(fn,ln);

}
void sort(int fn,int ln){
    int mn=(fn+ln)/2;
    while(fn<=ln){
        if(arr[mn]==search){
            printf("%d present in %d index.",search,mn);
            exit(1);
        }
        else {
            if(arr[mn]<search){
                sort(fn+1,ln);
            }
            else{
                sort(fn,mn-1);
            }
        }
    }
    if(arr[mn]!=search){
        printf("Number is not present.");
        exit(1);
    }

}
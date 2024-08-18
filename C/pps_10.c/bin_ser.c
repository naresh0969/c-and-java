/*Write C program that user to search for a key value in a given 
list of integers using binary search metnod(sorted list of integers.*/

#include<stdio.h>
void main(){
    int fn=0,ln,middle,size,search;
    printf("no. of values ? ");
    scanf("%d",&size);
    int arr[size];
    printf("Enter values :");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    printf("Number to search ? ");
    scanf("%d",&search);
    ln=size-1;
    middle=(fn+ln)/2;
    while(fn<=ln){
        if(search>arr[middle]){
            fn=middle+1;
        }
        else if(search==arr[middle]){
            printf("%d present in %d index :",search,middle);
            break;
        }
        else{
            ln=middle-1;
        }
        middle=(fn+ln);
    }
    if(search!=arr[middle]){
        printf("%d is not present in the list.",search);
    }

}
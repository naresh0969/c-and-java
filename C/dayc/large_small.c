//Write a C program to print the largest and smallest number among N numbers in a array.
#include<stdio.h>
void main(){
    int num[100],small=0,large=0,size;
    printf("Enter size :");
    scanf("%d",&size);
    for(int i=0;i<size;i++){
        scanf("%d",&num[i]);
        if(num[i]>large){
            large=num[i];
        }
        for(int j=0;j<size;j++){
            if(num[i]<=small){
                small=num[i];
            }
        }
    }
    // for(int j=0;j<size;j++){
    //     if(num[j]<large){
    //         small=num[j];
    //     }
    
    printf("The largest number is %d \n",large);
    printf("The smallest number is %d ",small);
}
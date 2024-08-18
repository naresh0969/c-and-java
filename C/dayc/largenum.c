//Write a C program to print the largest number among N numbers in a array.
#include<stdio.h>
int main(){
    int num[100],size,large,small,i;
    printf("Enter set size :");
    scanf("%d",&size);
   
    for( i=0;i<size;i++){
        printf("Number :");
        scanf("%d",&num[i]);
    }
    large=small=num[0];
    for( i=1;i<size;i++){
        if(num[i]>large){
            large=num[i];
        }
        if(num[i]<small){
            //printf("%d \n",num[i]);
            small=num[i];
        }
    }
    printf("The largest numder is %d\n",large);
    printf("The largest numder is %d",small);
    

}
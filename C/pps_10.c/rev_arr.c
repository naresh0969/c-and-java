//Write c program to store elements of array reverse the array and sum of the array.
#include<stdio.h>
void main(){
    int size,arr[20],i=1,sum;
    printf("how many numbers want to enter ?");
    scanf("%d",&size);
    for(i;i<=size;i++){
        scanf("%d",&arr[i]);
        sum+=arr[i];
    }
    

    printf("After reverse :\n");
    for(size;size>=1;size--){
        printf("%d ",arr[size]);
    }
    printf("\nsum is %d",sum);
}
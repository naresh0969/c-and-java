//write a c program to print the elements in array reverse.
#include<stdio.h>
void main(){
    int arr[100],size;
    printf("Enter size  :");
    scanf("%d",&size);
    for(int i=1;i<=size;i++){
        scanf("%d",&arr[i]);
    }
    printf("\n");
    for(size;size>0;size--){
        printf("%d ",arr[size]);
    }

}
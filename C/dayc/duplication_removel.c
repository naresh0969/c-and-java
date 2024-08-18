//Write a C program to remove duplicate value in the array.
#include<stdio.h>
int main(){
    int size;
    printf("Enter size :");
    scanf("%d",&size);
    int arr1[size],arr2[size];
    printf("Enter numbers :");
    for(int i=0;i<size;i++){
        scanf("%d",&arr1[i]);
    }
    for(int i=0;i<size;i++){
        for(int j=1;j<size;j++){
            if(arr1[i]==arr1[j]){
                arr2[i]=arr1[i];
            }
            
        }
    }
    printf("After removing..\n");
    for(int i=1;i<=size;i++){
        printf("%d ",arr2[i]);
    }


}
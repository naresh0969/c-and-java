//binary sort
#include<stdio.h>
void sort(int arr[],int search);
void main(){
    int s,search;
    printf("Enter size :");
    scanf("%d",&s);
    int arr[s];
    printf("Enter values :");
    for(int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }
    printf("Enter value to search :");
    scanf("%d",&search);
    sort(arr[s],search);
    
}
void sort(int arr[],int search){
    int fn=0,mn,ls=
}
//C Program to print the index of the user entered number.
#include<stdio.h>
void main(){
    int arr[]={1,5,34,78,43,90,100,34,24,54,66,6},num,i=0;
    printf("The list of numbers :1,5,34,78,43,90,100,34,24,54,66,6\n");
    printf("Enter number :");
    scanf("%d",&num);
    for(i;i<sizeof(arr);i++){
        if(num==arr[i]){
            printf("The index of %d is %d",num,i);
            break;
        }
    }
    if(num!=arr[i]){
        printf("The number is not present in the list !");
    }
}
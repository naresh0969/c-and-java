//C program to search a number is in an arry or not.
#include<stdio.h>
void main(){
    int arr[]={2,5,19,34,67,32};
    int num,num2,i=0;
    printf("Enter number :");
    scanf("%d",&num);
    for(i;i<sizeof(arr);i++){
        if(num==arr[i]){
            
            printf("%d is Present\n",num);
            break;
        }
    }
    if(num!=arr[i]){
        printf("Not Present");

    }
    
}
//write a c program to read n number of values in an arry and reverse the array elements.
#include<stdio.h>
#include<string.h>
void main(){
    int arr[100],count;
    printf("**Enter 0 to exit.\n");
    printf("Enter numbers :");
    for(int i=1;;i++){
        scanf("%d",&arr[i]);
        if(arr[i]==0){
            break;
        }
        count++;
        
        
    }
    for(int i=count;i>0;i--){
        printf("%d ",arr[i]);

    }
}
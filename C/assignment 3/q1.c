//Write c program to find the second largest element in an arry.
#include<stdio.h>
void main(){
    int arr[20],size,temp=0;
    printf("Enter size:");
    scanf("%d",&size);
    printf("Enter numbers :");

    //taking input from the user

    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    for(int j=0;j<size;j++){
        for(int k=j+1;k<size;k++){
            if(arr[j]<arr[k]){
                temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;

            }
        }
    }
    
    printf("The second largest number is :%d ",arr[1]);
    

}
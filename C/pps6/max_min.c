//write a c  program to find min,max,avg of an array.
#include<stdio.h>
int main(){
    int arr[100],size,avg=0;
    printf("Enter the size :");
    scanf("%d",&size);
    printf("Enter numbers :");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
        avg+=arr[i];
    }
    for(int i=0;i<size;i++){
        for(int j=i+1;j<=size;j++){
            int temp;
            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        

    }
    
    printf("The minimum :%d\n",arr[-1]);
    printf("The maximum :%d\n",arr[0]);
    printf("The Average :%d",avg/size);

    

}
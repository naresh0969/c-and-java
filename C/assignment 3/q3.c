// Write C program to count the total number od duplicate elements in an arry.
#include<stdio.h>
void main(){
    int arr[50],count,dup=0;
    printf("Enter 0 to EXIT !\n");
    printf("Enter elements :");
    for(int i=0;;i++){
        scanf("%d",&arr[i]);
        if(arr[i]==0){
            break;
        }
        count++;
    }

    for(int i=0;i<=count;i++){
        for(int j=i+1;j<=count;j++){
            if(arr[i]==0){
                continue;
            }
            else if(arr[i]==arr[j]){
                dup++;
                arr[j]=0;
            }
        }
    }
    printf("count %d",dup);
}
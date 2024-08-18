//C program to sort the user entered numbers.
#include<stdio.h>
int main(){
    int size;
    printf("Enter size :");
    scanf("%d",&size);
    int arr[size],temp,i,j;
    printf("Enter Numbers :");
    for(i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    for(i=0;i<size;i++){
        
        for (j = i+1; j <size; j++)
        {
            if (arr[j]<arr[i])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
        }
        
    }
    for (int i = 0; i < size; i++)
    {
        printf("%d ",arr[i]);
    }
    
}

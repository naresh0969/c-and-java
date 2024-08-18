//Write c program to read a matrix and print it's diagonal elements.
#include<stdio.h>
void main(){
    int arr[20][20],r,c;
    printf("Enter rows :");
    scanf("%d",&r);
    printf("Enter colums :");
    scanf("%d",&c);
    if(r==c){
        // Taking elements from user.
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                scanf("%d",&arr[i][j]);
            }
        }
        for(int i=0;i<r;i++){
            printf("%d ",arr[i][i]);
        }
    }
    else{
        printf("Wrong input : it's not a square matrix");
    }

}
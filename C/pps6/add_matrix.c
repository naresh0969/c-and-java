//write a c program to print add of two matrices.
#include<stdio.h>
int main(){
    int arr1[100][100],arr2[100][100],arr3[100][100],r1,c1,r2,c2;
    printf("Enter no. of rows in 1st matrix :");
    scanf("%d",&r1);
    printf("Enter no. of columns in 1st matrix :");
    scanf("%d",&c1);
    printf("Enter no. of rows in 2st matrix :");
    scanf("%d",&r2);
    printf("Enter no. of columns in 2st matrix :");
    scanf("%d",&c2);
    
    if((r1==r2)&&(c1==c2)){
        printf("Enter A matrix elements :");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                scanf("%d",&arr1[i][j]);
            }
        }
        printf("Enter B matrix elements :");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                scanf("%d",&arr2[i][j]);
            }
        }
        printf("\n");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                printf("%d  ",arr3[i][j]);
            }
            printf("\n");
        }



    }

}
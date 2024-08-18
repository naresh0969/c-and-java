//write a c program to print the transpose of a matrix.
#include<stdio.h>
int main(){
    int mat1[100][100],r,c,size,mat2[100][100];
    printf("Enter rows of matrix :");
    scanf("%d",&r);
    printf("Enter colums of matrix :");
    scanf("%d",&c);
    printf("Enter elements :");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            scanf("%d",&mat1[i][j]);
        }
    }
    for(int i=0;i<c;i++){
        for(int j=0;j<r;j++){
            printf("%d  ",mat1[j][i]);
        }
        printf("\n");
    }
}
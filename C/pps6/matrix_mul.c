//Multiplication of two matrices.
#include<stdio.h>
int main(){
    int mat1[100][100],mat2[100][100],mat3[100][100],r1,c1,r2,c2;
    printf("Matrix A rows:");
    scanf("%d",&r1);
    printf("Matrix A colums:");
    scanf("%d",&c1);
    printf("Matrix B rows:");
    scanf("%d",&r2);
    printf("Matrix B colums:");
    scanf("%d",&c2);

    if((r1==c2)&&(r2==c1)){
        //accessing A matrix elements
        printf("Enter A matrix elements");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                scanf("%d",&mat1[i][j]);
            }
        }
        //accessing B matrix elements.
        printf("Enter B matrix elements");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                scanf("%d",&mat2[i][j]);
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<r1;j++){
                for(int k=0;k<c1;k++){
                    mat3[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }
        //to print multiplication matrix.
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                printf("%d ",mat3[i][j]);
            }
            printf("\n");
        }

    }
    
    
}
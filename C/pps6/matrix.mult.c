// Matrix multiplication.
#include<stdio.h>
void main(){
    int mat1[100][100],mat2[100][100],mat3[100][100],r1,r2,c1,c2;
    printf("A matrix Rows :");
    scanf("%d",&r1);
    printf("A matrix colums :");
    scanf("%d",&c1);
    printf("B matrix Rows :");
    scanf("%d",&r2);
    printf("B matrix colums:");
    scanf("%d",&c2);
    if(r1==c2&&c1==r2){
        printf("Enter A matrix values :");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                scanf("%d",&mat1[i][j]);
            }
        }
        printf("Enter B matrix values :");
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
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                printf("%d ",mat3[i][j]);
            }
            printf("\n");
        }
    }
}
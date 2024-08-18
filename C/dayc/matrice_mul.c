//Mnltiplicationof two matrices
#include<stdio.h>
int main(){
    int r1,r2,c1,c2;
    printf("Enter no. of rows of A matrix :");
    scanf("%d",&r1);

    printf("Enter no. of colums of A matrix :");
    scanf("%d",&c1);
    printf("Enter no. of rows of B matrix :");
    scanf("%d",&r2);
    printf("Enter no. of colums of B matrix :");
    scanf("%d",&c2);
    int a[r1][c1],b[r2][c2];
    if(r1==c2){
        printf("Enter A elements in row vise :");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                scanf("%d",&a[i][j]);
            }
        }
        printf("Enter B elements :");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                scanf("%d",&b[i][j]);
            }
        }
    }
    printf("A elements :");
    for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                printf("%d ",a[i][j]);
            }
        }
    printf(" B elements :");
    for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            printf("%d",b[i][j]);
        }
    }
}
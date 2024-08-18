//Addtion,numltiplication,transpose of a matrix
#include<stdio.h>

void addition(int arr1[],int arr2[],int r1,int c1){
        int arr3[r1][c1],i,j;
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        printf("Addition of A & B matrix ");
        for(int i=0;i<r1;i++){
        	for(int j=0;j<c1;j++){
        		printf("%d ",arr3[i][j]);
        	}
        }
                      
                
}
        
void main(){
	int r1,c1,r2,c2;
	printf("Rows of A matrix? ");
	scanf("%d",&r1);
	printf("columns of A matrix? ");
	scanf("%d",&c1);
	printf("Rows of B matrix? ");
	scanf("%d",&r2);
	printf("columns of B matrix? ");
	scanf("%d",&c2);
	int arr1[r1][c1],arr2[r2][c2];
	printf("Enter A matrix values :");
	for(int i=0;i<r1;i++){
		for(int j=0;j<c1;j++){
			scanf("%d",&arr1[i][j]);
		}
	}
	printf("Enter B matrix values :");
	for(int i=0;i<r2;i++){
		for(int j=0;j<c2;j++){
			scanf("%d",&arr2[i][j]);
		}
	}
	
	if((r1==r2)&&(c1==c2)){
		addition(arr1,arr2);
	}
}
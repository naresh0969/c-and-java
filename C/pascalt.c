#include<stdio.h>
int main(){
    int num,space,coff=1;
    printf("Enter size of Pascal's Triangle :");
    scanf("%d",&num);
    for(int i=0;i<num;i++){
        for(space=0;space<=num-i;space++){
            printf("  ");
        }
        for(int j=0;j<=i;j++){
            if(j==0){
                printf("1");

            }
            else{
                coff=coff*(i-j+1)/j;
                printf("%4d",coff);
            }
        }
        printf("\n");
    }
    
}
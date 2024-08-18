// pascal Triangle
#include<stdio.h>
int main(){
    printf("Pascal Triangle.\n");
    int num,i,j,space,coff=1;
    printf("Enter N value :");
    scanf("%d",&num);
    for(i=0;i<num;i++){
        for(space=0;space<num-i;space++){
            printf("  ");
        }
        for(j=0;j<=i;j++){
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
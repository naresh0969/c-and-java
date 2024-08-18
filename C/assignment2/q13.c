/*13. Write a C program to print equilateral triangle or pyramid star pattern series of n rows using for loop.
	    *
       ***
      *****
     *******   */
#include<stdio.h>
int main(){
    int num,space;
    printf("Enter Rows :");
    scanf("%d",&num);
    for(int i=1;i<=num;i++){
        for(space=0;space<num-i;space++){
            printf(" ");
            
        }
        for(int j=1;j<=(2*i-1);j++){
            printf("*");
        }
        printf("\n");
    }
    return(0);
}
/*12.Write a C program to printt right triangle (as follows) star patter series using for loop. by taking of lines n value from the user.
	*
	**
	***
	****  */
#include<stdio.h>
int main(){
    int num;
    printf("Enter rows :");
    scanf("%d",&num);
    for(int i=1;i<=num;i++){
        for(int j=0;j<i;j++){
            printf("*");
        }
        printf("\n");
    }
}
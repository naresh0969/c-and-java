
/*1. Write a program that prints a multiplication table for a given number and the number of rows in
the table. For example, for a number 5 and rows = 3, the output should be:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15 */

#include<stdio.h>
int main(){
    int num,row;
    printf("Enter any number :");
    scanf("%d",&num);
    printf("Enter no. of rows :");
    scanf("%d",&row);
    for(int i=1;i<=row;i++){
        printf("%d * %d =%d\n",num,i,num*i);
    }
}
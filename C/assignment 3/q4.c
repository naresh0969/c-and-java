/*Write C program to read an array of n integers and read a number to be searched. If search number found then print its position and
if not found print "number is not found".*/
#include<stdio.h>
void main(){
    int arr[50],num,count,j;
    printf("Enter 0 to EXIT !\n");
    printf("Enter elements :");
    for(int i=0;;i++){
        scanf("%d",&arr[i]);
        if(arr[i]==0){
            break;
        }
        count++;
    }
    printf("Enter number to search :");
    scanf("%d",&num);
    for(j;j<count;j++){
        if(num==arr[j]){
            printf("%d present in %d index.",num,j);
            break;
        }
    }
    if(num!=arr[j]){
        printf("Number is not found.");
    }

}
// Write a C program to insert an element and to delete an element from the arry.
#include<stdio.h>
void main(){
    int ele,add;
    int set[]={1,2,3,4,5};
    printf("The array =[1,2,3,4,5]\n");
    printf("Enter index position of element(0-4) :");
    scanf("%d",&ele);
    printf("After removing the element :");
    //removing the element.
    for(int i=0;i<5;i++){
        if(i==ele){
            continue;
        }
        else{
            printf("%d ",set[i]);
        }
    }
    printf("\n");
    //adding element
    printf("Enter element to add :");
    scanf("%d",&add);
    set[5]=add;
    printf("After adding :");
    for(int i=0;i<=5;i++){
        printf("%d ",set[i]);
    }




}
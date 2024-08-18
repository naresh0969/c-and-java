//C program to find the length of a string without using strlen().
#include<stdio.h>
void main(){
    int count;
    char name[20];
    printf("Enter name :");
    scanf("%s",name);
    for(int i=0;name[i]!='\0';i++){
        count++;
    }
    printf("%d",count);

}
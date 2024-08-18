//C program to conver a name into ascii values.
#include<stdio.h>
#include<string.h>
int main(){
    int len;
    char name[20];
    printf("Enter name :");
    scanf("%s",name);
    len=strlen(name);
    for(int i=0;i<len;i++){
        printf("%d ",name[i]);
    }
    return(0);
}
#include<stdio.h>
#include<ctype.h>
void main(){
    char a;
    printf("Enter character :");
    scanf("%c",&a);
    if(islower(a)){
        printf("%c",toupper(a));
    }
}
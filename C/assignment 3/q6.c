//write a C program to check whether the entered character is digit or alphabet
#include<stdio.h>
#include<ctype.h>
void main(){
    char alp;
    printf("Enter Character :");
    scanf("%c",&alp);
    alp=tolower(alp);
    if(alp>='a' && alp<='z'){
        printf("Character ");
    }
    else if(alp>='0' && alp<='9'){
        printf("Digit");
    }
}
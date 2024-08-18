//C program to count blanks,tabs,newlines.
#include<stdio.h>
int main(){
    int blank=0,tab=0,nl=0;
    char sent[50];
    printf("Type Sentence :");
    scanf("%s",sent);
    for(int i=0;i<sizeof(sent);i++){
        if(sent[i]==" "){
            blank++;
        }
        if(sent[i]=='\t'){
            tab++;
        }
        if(sent[i]=='\n'){
            nl++;
        }
    }
    printf("%d %d %d",blank,tab,nl);
}
// Write a C program to read a sentence and replace lowercase characters with uppercase and vice versa.
#include<stdio.h>
void main(){
    char str[20];
    printf("Give sentence :");
    gets(str);
    for(int i=0;str[i]!='\0';i++){
        if(str[i]>='a' && str[i]<='z'){ //97-122
            str[i]=str[i]-32;
        }
        else if(str[i]>='A' && str[i]<='Z'){
            str[i]=str[i]+32;
        }
        
    }
    puts(str);
}
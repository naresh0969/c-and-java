// C program to reverse the sentence using recursion.
#include<stdio.h>
char reverse(char str);
int main(){
    char arr[100];
    printf("Enter Sentence :");
    gets(arr);
    reverse(arr);
}
char reverse(char str){
    int size=sizeof(str);
    return(str[size]);
}
//C program to search a charecter in a string and print its index value.
#include<stdio.h>
void main(){
    char arr[50],let;
    int i;
    printf("Which character to search :");
    scanf("%c",&let);
    printf("Enter string :");
    scanf("%s",arr);
    
    for(i=0;arr[i]!='\0';i++){
        if(let==arr[i]){
            
            printf("%c is Present\n",let);
            printf("present in index %d.",i);
            break;
        }
    }
    if(let!=arr[i]){
        printf("Not Present");

    }
    
}
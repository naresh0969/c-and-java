#include<stdio.h>
#include<ctype.h>
int main(){
    
    char a;
    printf("Enter any Letter :");
    scanf("%c",&a);
    if(islower(a)){
        printf("%c",toupper(a));
    }
    else{
        printf("%c",tolower(a));
    }
    return(0);
}
/*changing uppercase letter to lower case and vice versa*/
#include<stdio.h>
#include<ctype.h>
int main(){
    printf("Enter a Alphabet :");
    char alp;
    scanf("%c",&alp);
    if(islower(alp)){
        printf("%c",toupper(alp));
    }
    else if(isupper(alp)){
        printf("%c",tolower(alp));
    }
    return(0);
}
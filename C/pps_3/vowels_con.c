//vowels
#include<stdio.h>
#include<ctype.h>
int main(){
    printf("enter a Alphabet :");
    char alp;
    scanf("%c",&alp);
    alp=tolower(alp);

    if(alp=='a'||alp=='e'|| alp=='i'||alp=='o'||alp=='u'){
        printf("%c is a vowel ",alp);
    }
    else{
        printf("%c is a cosonent ",alp);
    }
    return(0);

}
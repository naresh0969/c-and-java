//3Q Write a C program to input any alphabet and check whether it's vowel or consonant
#include <stdio.h>
#include <ctype.h>
int main()
{
    char alp;
    printf("Enter Alphabet :");
    scanf("%c", &alp);
    alp = tolower(alp);
    if (alp == 'a' || alp == 'e' || alp == 'i' || alp == 'o' || alp == 'u')
    {
        printf("Vowel!");
    }
    
    else
    {
        printf("Consonant!");
    }
}
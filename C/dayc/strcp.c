//C program for coping one string to another string without using strcp().
#include<stdio.h>
#include<string.h>

void main(){
    char str1[40],str2[20],len1,len2;
    printf("Enter string :");
    
    gets(str1);
    printf("Enter another string :");
    gets(str2);
    len1=strlen(str1);
    len2=strlen(str2);
    
    printf("After copy.\n");
    

    for(int i=0;i<=len2;i++){
        str1[len1+1+i]+=str1[i];
        
    }
    puts(str1);

    

}
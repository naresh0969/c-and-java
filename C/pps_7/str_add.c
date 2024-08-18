#include<stdio.h>
#include<string.h>
void main(){
    char str1[10],str2[10],str3[10];
    int index,len1,len2;
    printf("Enter 1st String :");
    scanf("%s",str1);
    printf("Enter 2nd String :");
    scanf("%s",str2);
    printf("add to index :");
    scanf("%d",&index);
    len1=strlen(str1);
    len2=strlen(str2);
    for(int i=index;i<=len1;i++){
        str3[i]=str1[i];
    }
    len1-=index;
    for(int i=index-1;i<len1+len2;i++){
        for(int j=0;j<len2;j++){
            str1[i]=str2[j];
        }
        
    }
    // for(int i=0;str1[i]!='\0';i++){
    //     printf("%c",str1[i]);
    // }
    printf("%s",str1);
}
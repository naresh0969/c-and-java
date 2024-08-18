//C program to add sub string to the main string.
#include<stdio.h>
#include<string.h>
void main(){
    char str[30],sub[30];
    int ind,l1,l2;
    printf("Enter String :");
    scanf("%s",str);
    printf("Enter Sub string :");
    scanf("%s",sub);
    printf("Position :");
    scanf("%d",&ind);
    l1=strlen(str);
    l2=strlen(sub);
    for(int i=ind;i<l2;i++){
        str[i+l2]=str[i];
        
    }
    for(int i=0;i<l2;i++){
        str[i+ind]=sub[i];
    }
    printf("%s",str);
    
}
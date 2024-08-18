#include<stdio.h>
#include<string.h>
void main(){
    char main[50],sub[50],temp[100];
    int n,i,j;
    printf("Main string :");
    scanf("%s",main);
    printf("Sub string :");
    scanf("%s",sub);
    printf("Enter index :");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        temp[i]=main[i];
    }
    strcat(temp,sub);
    for(i=strlen(temp);main[n]!='\0';i++,n++){
        temp[i]=main[n];
    }
    printf("%s",temp);
}
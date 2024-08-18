#include<stdio.h>
#include<stdlib.h>
void main(){
    int *ptr;
    int n;
    printf("Elements: ");
    scanf("%d",&n);

    ptr = (int*)malloc(n*sizeof(int));
    for (int i = 0; i < n; ++i)
    {
        printf("%u ",(ptr+i));
    }
    
    ptr = realloc(ptr,40);
    for (int i = 0; i < n+3; ++i)
    {
        printf("%u ",(ptr+i));
    }


    free(ptr);
}
#include<stdio.h>
#include<stdlib.h>
void main(){
    int num;
    printf("Enter size of array :");
    scanf("%d",&num);
    int* ptr;
    ptr=(int *) calloc (num, sizeof(int));
    printf("%d",sizeof(ptr));
    for(int i=0;i<num;i++){
        scanf("%d",&ptr[i]);
    }
    for(int i=0;i<num;i++){
        printf("%d ",ptr[i]);
    }
    free(ptr);
    printf("%d",sizeof(ptr));
}

    
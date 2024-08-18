#include<stdio.h>

typedef struct
{
    char name[10];
    int age;
}data;

void main()
{
    data d[5];
    for(int i=0;i<1;i++)
    {
        printf("NAme: ");
        scanf("%s",d[i].name);

        printf("Age: ");
        scanf("%d",&d[i].age);
    }

    printf("Name: %s Age: %d \n",d[0].name,d[0].age);
}

#include<stdio.h>
#include<string.h>
struct student{
    char name[100];
    int id;
    float cgpa;
};
int main(){
    struct student s1;
    strcpy(s1.name,"Naresh");
    s1.id=201013;
    s1.cgpa=9.85;
    printf("%s,%d,%.2f\n",s1.name,s1.id,s1.cgpa);
    struct student s2={"Jony",201011,7.7};
    printf("%s ,%d,%f",s2.name,s2.id,s2.cgpa);

    
    return(0);
}
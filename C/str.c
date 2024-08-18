//Structure programs
typedef struct stu{
    char name[20];
    int marks;

}data;
#include<stdio.h>
void main(){
    data res[5];
    int max,min=res[0].marks,c,d;
    for(int i=0;i<3;i++){
        printf("Enter student name :");
        scanf("%s",res[i].name);
        printf("Enter marks :");
        scanf("%d",&res[i].marks);
    }
    for(int i=0;i<3;i++){
        
        if(res[i].marks>max){
            max=res[i].marks;
            c=i;
            
        }
        if(res[i].marks<min){
            min=res[i].marks;
            d=i;
        }
        
    }
 
    printf("Highest scorer :%s\n",res[c].name);
    printf("Lowest scorer :%s",res[d].name);
}
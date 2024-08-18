/*Q11 Write C program to accept the details of employee and display them using structure.
Details consist of Employee ID, Name , Designation,Department,Salary.*/
struct emp{
    int id,salary;
    char name[20],desig[20],dep[20];
};
#include<stdio.h>
void main(){
    int tot;
    printf("Nmber of Employees =");
    scanf("%d",&tot);
    struct emp data[tot];
    for(int i=0;i<tot;i++){
        printf("Employee I'D :");
        scanf("%d",&data[i].id);
        printf("Employee Name :");
        scanf("%s",data[i].name);
        printf("Designation :");
        scanf("%s",data[i].desig);
        printf("Department:");
        scanf("%s",data[i].dep);
        printf("Salary :");
        scanf("%d",&data[i].salary);

    }
    printf("Employee Data :");
    for(int i=0;i<tot;i++){
        printf("Employee I'D :%d\n",data[i].id);
        printf("Name:%s\n",data[i].name);
        printf("Designation :%s\n",data[i].desig);
        printf("Department:%s\n",data[i].dep);
        printf("Salary:%d\n",data[i].salary);
    }
    printf("\n");
}
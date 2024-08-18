/*Q10 Write C program  to store n elements in an array and print the elements using pointer,
find the sum of elements using pointer*/
#include<stdio.h>
void main(){
    int arr[50],num,count,j,*p,sum;
    printf("Enter 0 to EXIT !\n");
    printf("Enter elements :");
    for(int i=0;;i++){
        scanf("%d",&arr[i]);
        if(arr[i]==0){
            break;
        }
        count++;
    }
    printf("Elements Entered :");
    for(int i=0;i<count;i++){
        p=&arr[i];
        sum+=*p;
        printf("%d ",*p);
    }
    printf("\n");
    printf("sum of elements :%d",sum);
    

}

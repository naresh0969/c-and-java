//write a c program to find mean,variance ,standard deviation.
#include<stdio.h>
#include<math.h>
int main(){
    int arr[100],size;
    float mean=0,varience=0,std;
    printf("No. of elements :");
    scanf("%d",&size);
    printf("Enter numbers :");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
        mean+=arr[i];

    }
    mean/=size;
    for(int i=0;i<size;i++){
        varience+=(arr[i]-mean)*(arr[i]-mean);
    }
    varience/=size;
    std=sqrt(varience);
    printf("mean : %.2f\n",mean);
    printf("varience : %.2f\n",varience);
    printf("standard deviation : %.2f\n",std);
    return(0);

}
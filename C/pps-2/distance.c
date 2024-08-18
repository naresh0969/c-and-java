// to find distace between two points
//distance=
#include<stdio.h>
#include<math.h>
int main(){
    int a,b,c,d,f;
    printf("enter x1 value \n");
    scanf("%d",&a);
    printf("enter x2 value \n");
    scanf("%d",&b);
    printf("enter y1 value :");
    scanf("%d",&c);
    printf("enter y2 value");
    scanf("%d",&d);
    f=sqrt(pow((b-a),2)+pow((d-c),2));
    printf("the distence between the two points is %d ",f);
    return 0;
}

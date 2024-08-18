//Q5 Write a java program to multiply two matrices.
import java.util.Scanner;
class Result{
    void product(int r1, int c1,int r2,int c2){
        Scanner scan=new  Scanner(System.in);
        int A[][]=new int[r1][c1];
        int B[][]=new int[r2][c2];
        System.out.println("enter A elements :");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                A[i][j]=scan.nextInt();
            }
        }
        System.out.println("enter B elements :");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                B[i][j]=scan.nextInt();
            }
        }
        int arr[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    arr[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        System.out.println();
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        scan.close();

    }
}
public class matrix_product {
    public static void main(String args[]){
        Scanner scan=new  Scanner(System.in);
        int r1,r2,c1,c2;
        System.out.println("Enter A matrix rows :");
        r1=scan.nextInt();
        System.out.println("Enter A matrix columns :");
        c1=scan.nextInt();
        System.out.println("Enter B matrix rows :");
        r2=scan.nextInt();
        System.out.println("Enter B matrix columns :");
        c2=scan.nextInt();
        if(r1==c2 && c1==r2){
            
            Result obj=new Result();
            obj.product(r1,c1,r2,c2);

        }
        else{
            System.out.println("multiplication is not possible!");
        }
        scan.close();
    }
    
}

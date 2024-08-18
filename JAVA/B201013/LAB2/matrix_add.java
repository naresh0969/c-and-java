//Q4 Write a java program to add two matrices.

import java.util.*;
class matrix{
    int row1,row2,column1,column2;
    int result[][];
    void add(int a[][],int b[][]){
        result=new int[row1][column1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<column1;j++){
                result[i][j]=a[i][j]+b[i][j];
            }
        }

    }
    void display(){
        for(int i=0;i<row1;i++){
            for(int j=0;j<column1;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
public class matrix_add {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.print("Rows of A matrix =");
        r1=scan.nextInt();
        System.out.print("Columns of A matrix =");
        c1=scan.nextInt();
        System.out.print("Rows of B matrix =");
        r2=scan.nextInt();
        System.out.print("Columns of B matrix =");
        c2=scan.nextInt();
        if(r1==r2&&c1==c2){
            matrix m1=new matrix();
            m1.row1=r1;
            m1.column1=c1;
            m1.row2=r2;
            m1.column2=c2;
            int [][]a=new int[r1][c1];
            int [][]b=new int[r2][c2];
            System.out.println("Enter A matrix elements :");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    a[i][j]=scan.nextInt();

                }
            }
            System.out.println("Enter B matrix elements :");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    b[i][j]=scan.nextInt();

                }
            }
            m1.add(a,b);
            m1.display();

        }
        else{
            System.out.println("Addition is not possible");
        }

        

        scan.close();

    }
}

//Dat: 14/10/2021
//TO FIND DIFFERENT OPERATIONS ON MATRIX
import java.util.Scanner;
class matrix
{
    int matrix[][]=new int[10][10];
    int rows, columns;
    boolean isUpperTriangular= true;
    Scanner sc=new Scanner(System.in);
    matrix()
    {
        rows=0;
        columns=0;
    }
    matrix(int r, int c)
    {
        rows=r;
        columns=c;
        matrix=new int[rows][columns];
    }
    void create()
    {
        System.out.println("Enter no. of rows: ");
        rows=sc.nextInt();
        System.out.println("Enter no. of columns: ");
        columns=sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                matrix[i][j]=sc.nextInt();
            }
            System.out.println("");
        }
    }
    void display()
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print("" +matrix[i][j]);
            }
            System.out.println();
        }
    }
    void square_matrix()
    {
        if (rows==columns)
            System.out.println("It is a square matrix");
        else
            System.out.println("It is not a square matrix");
    }
    void upper_triangular()
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(matrix[i][j]!=0)
                {
                    isUpperTriangular= false;
                    break;
                }
                if(!isUpperTriangular)
                    break;
            }
        }
        if(isUpperTriangular)
            System.out.println("It is upper triangular matrix");
        else
            System.out.println("It is not upper triangular matrix");
    }
    void add(matrix a)
    {
        if(a.rows==rows&&a.columns==columns)
        {
            int c[][]=new int[rows][columns];
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<columns;j++)
                {
                    c[i][j]=matrix[i][j]+a.matrix[i][j];
                }
            }
            System.out.println("Addition of two matrices is: ");
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<columns;j++)
                {
                    System.out.println(""+c[i][j]);
                }
                System.out.println("");
            }
        }
        else
            System.out.println("Addition is not possible");
    }
    void multiplication(matrix a, matrix b)
    {
        int c[][]=new int[rows][columns];
        if(a.rows==b.columns)
        {
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<columns;j++)
                {
                    for(int t=0;t<a.rows;t++)
                    {
                        c[i][j]=+b.matrix[i][t]*a.matrix[t][j];
                    }
                }
            }
            System.out.println("Multiplication is: ");
            for(int i=0;i<rows;i++)
            {
                for(int j=0;j<rows;j++)
                {
                    System.out.println(""+c[i][j]);
                }
                System.out.println("");
            }
        }
        else
            System.out.println("Multiplication is not possible");
    }
    void transpose()
    {
        int trans[][]=new int[columns][rows];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                trans[j][i]=matrix[i][j];
            }
        }
        System.out.println("\nTranspose is: \n");
        for(int i=0;i<columns;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.println(""+trans[i][j]);
            }
            System.out.println();
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        matrix a=new matrix();
        matrix b=new matrix();
        int ch;
        do {
            System.out.println("1.Create a matrix");
            System.out.println("2.Display a matrix");
            System.out.println("3.Check if it is a square matrix");
            System.out.println("4.Check if it is a upper triangular matrix");
            System.out.println("5.Addition of a  matrix");
            System.out.println("6.Multiplication of a  matrix");
            System.out.println("7.Transpose of a  matrix");
            System.out.println("8.Exit");
            System.out.println("Enter your choice: ");
            ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("Matrix 1. is: ");
                    a.create();
                    System.out.println("Matrix 2. is: ");
                    b.create();
                    break;

                case 2:
                    System.out.println("Matrix 1. is: ");
                    a.display();
                    System.out.println("Matrix 2. is: ");
                    b.display();
                    break;

                case 3:
                    System.out.println("Matrix 1: ");
                    a.square_matrix();
                    System.out.println("Matrix 2: ");
                    b.square_matrix();
                    break;

                case 4:
                    System.out.println("Matrix 1. is: ");
                    a.upper_triangular();
                    System.out.println("Matrix 2. is: ");
                    b.upper_triangular();
                    break;

                case 5:
                    System.out.println("Addition is: ");
                    a.add(b);
                    break;

                case 6:
                    System.out.println("Multiplication is: ");
                    a.multiplication(a,b);
                    break;

                case 7:
                    System.out.println("Matrix 1. is: ");
                    a.transpose();
                    System.out.println("Matrix 2. is: ");
                    b.transpose();
                    break;

                case 8:
                    System.out.println("Exit program");
                    break;
            }
        }while(ch!=0);
    }
}



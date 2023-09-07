import java.util.*;
public class matrixAddition
{
    public static void main(String[] args)
    {
        int col,rows,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        rows=sc.nextInt();
        System.out.println("Enter the number of cols");
        col=sc.nextInt();
        int mat1[][]=new int[rows][col];
        int mat2[][]=new int[rows][col];
        int res[][]=new int[rows][col];
        System.out.println("Enter the elements of matrix 1");
        try{
        for(i=0;i<rows;i++)
        {
            for(j=0;j<col;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
        System.out.println("Enter the elements of matrix 2");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<col;j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }

        //Addition
        for(i=0;i<rows;i++)
        {
            for(j=0;j<col;j++)
            {
                res[i][j]=mat1[i][j]+mat2[i][j];
            }
        }

        System.out.println("Resultant matrix: ");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(res[i][j] + "\t"); 
            }
            System.out.println("\n");
        }
        sc.close();
    }
}
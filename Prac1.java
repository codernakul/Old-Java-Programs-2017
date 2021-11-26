import java.util.*;
class Prac1
{
    void main()
    {
        int i,j,M,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Square Array");
        M=sc.nextInt();
        if(M>2&&M<10)//to check correct size
        {
            int A[][]=new int[M][M];
            for(i=0;i<M;i++)//for input of elements
            {
                for(j=0;j<M;j++)
                {
                    System.out.println("Enter element in the array");
                    A[i][j]=sc.nextInt();
                }
            }
            System.out.println("ORIGINAL MATRIX\n");
            for(i=0;i<M;i++)//to print original matrix
            {
                for(j=0;j<M;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println("");
            }
            System.out.println("ROTATED MATRIX\n");
            for(j=0;j<M;j++)//to print new(rotated matrix)
            {
                for(i=M-1;i>=0;i--)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println("");
            }
            System.out.println("Sum of the corner elements="+(A[0][0] + A[0][M-1] + A[M-1][0] + A[M-1][M-1]));            
        }
        else
        System.out.println("INVALID MATRIX");
    }
}
            
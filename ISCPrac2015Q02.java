import java.util.*;
class ISCPrac2015Q02
{
    public static void main(String args[])
    throws InputMismatchException{
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows (greater than 2 and less than 10) for the square matrix : ");
        int m=scan.nextInt();
        if(m<=2 || m>=10)
            System.out.println("SIZE OUT OF RANGE");
        else{
            int a[][]=new int[m][m];
            int b[] = new int[m*m];
            int i,j,ctr,c;
            System.out.println("Enter "+(m*m)+" numbers for the matrix: ");
            for(i=0;i < m;i++){
                for(j=0;j < m;j++){
                    a[i][j] = scan.nextInt();
                }
            }
            ctr = 0;
            System.out.println("ORIGINAL MATRIX");
            for(i=0;i < m;i++){
                for(j=0;j < m;j++){
                    System.out.print(a[i][j] + " ");
                    b[ctr++] = a[i][j];
                }
                System.out.println();
            }
            c = m-1;
            ctr = 0;
            do{
                for(i=0; i < m; i++)
                    a[i][c] = b[ctr++];
                c--;
            }
            while(c >= 0);
            System.out.println("MATRIX AFTER ROTATION");
            for(i=0;i < m;i++){
                for(j=0;j < m;j++){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Sum of the corner elements="+(a[0][0] + a[0][m-1] + a[m-1][0] + a[m-1][m-1]));
        }}}

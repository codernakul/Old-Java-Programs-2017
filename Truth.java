import java.util.*;
class Truth
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of variables : ");
        int col=sc.nextInt();
        int rows=(int)Math.pow(2,col),i,j,r,s,n;
        int tab[][]=new int[rows][col];
        for(i=0;i<rows;i++)
        {
            for(j=0;j<col;j++)
            {
                tab[i][j]=0;
            }
        }

        for(i=1;i<rows;i++)
        {
            n=i;
            j=col-1;
            int x=0;s=0;
            while(n!=0)
            {
                r=n%2;
                s+=r*Math.pow(10,x++);
                n/=2;
            }
            while(s!=0)
            {
                r=s%10;
                if(r==1)
                tab[i][j--]=1;
                else
                --j;
                s/=10;
            }
        }
        for(i=0;i<rows;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(tab[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("!!!HELLO!!!");
    }
}
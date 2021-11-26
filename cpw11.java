import java.util.*;
class cpw11{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[4][4];
        int j,k,i,t;
        for(i=0;i<4;i++)
        {	
            for(j=0;j<4;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(k=0;k<4;k++)
        {
            for(i=0;i<4-1;i++)
            {
                for(j=0;j<4-1;j++)
                {
                    if(a[k][j]>a[k][j+1])
                    {
                        t=a[k][j];
                        a[k][j]=a[k][j+1];
                        a[k][j+1]=t;
                    }
                }
            }
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.println(a[i][j]+"");
            }
            System.out.println();
        }
    }
}

import java.util.*;
class beta
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,j,t,s;
        System.out.println("Sizzzeeee....");
        s=sc.nextInt();
        int a[]=new int[s];
        for(i=0;i<s;i++)
        {
            System.out.println("Noooooooooooooooooooooo.................");
            a[i]=sc.nextInt();
            for(j=1;j<s;j++)
            {
            j=i;
            t=a[j];
            while(j>0&&t<a.length)
            {
                a[j]=a[j+1];
                j--;
            }
            a[j]=t;
        }}
        for(i=0;i<s;i++)
        System.out.println(a[i]+" ");
    }
}
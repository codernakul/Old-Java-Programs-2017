class p1
{
    void main(int a[][])
    {
        int i,j,s=0;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[0].length;j++)
            {
                s=s+a[i][j];
            }
        }
        System.out.println("Sum"+s);
        System.out.println("Average"+(s/(a.length*a[0].length)));
    }
}
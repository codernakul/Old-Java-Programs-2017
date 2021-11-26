class SumArray
{
    int n[][];
    SumArray(int nn[][])
    {
        int a=nn.length+1;
        int b=nn[0].length+1;
        n=new int[a][b];
        for(int i=0;i<a-1;i++)
        for(int j=0;j<b-1;j++)
        n[i][j]=nn[i][j];
    }
    
    void sumrows()
    {
        int s=0;
        for(int i=0;i<n.length-1;i++)
        {
            for(int j=0;j<n[0].length-1;j++)
            {
                s+=n[i][j];
            }
            n[i][n[0].length-1]=s;
            s=0;
        }
        for(int i=0;i<n.length-1;i++)
        System.out.println(n[i][n[0].length-1]);
    }
    
    void sumColumns()
    {
        int s=0;
        for(int j=0;j<n.length-1;j++)
        {
            for(int i=0;i<n[0].length-1;i++)
            {
                s+=n[i][j];
            }
            n[n.length-1][j]=s;
            s=0;
        }
        for(int i=0;i<n.length-1;i++)
        System.out.println(n[n.length-1][i]);
    }
    
    void sumDiagnols()
    {
        int s=0;
        for(int i=0;i<n.length-1;i++)
        {
            for(int j=0;j<n[0].length-1;j++)
            {
                if(i==j)
                s+=n[i][j];
            }
            n[n.length-1][n[0].length-1]=s;
        }
        System.out.println(n[n.length-1][n[0].length-1]);
    }
}
class KRS01
{
    void main(int n)
    {
        int i,s=0;
        for(i=1;i<10;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==n)
            System.out.println(n+"y");
    }
}


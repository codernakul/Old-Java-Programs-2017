class Smith
{
    int sum(int n)
    {
        int s=0;
        while(n!=0)
        {
            s+=(n%10);
            n/=10;
        }
        return s;
    }
    boolean isSmith(int n)
    {
        int s,ss=0;
        int i=2;
        s=sum(n);
        while(n!=1)
        {
            if(n%i==0)
            {
                ss+=sum(i);
                n=n/i;
            }
            else
            ++i;
        }
        if(s==ss)
        return true;
        else 
        return false;
    }
    void main(int n)
    {
        int i;
        for(i=1;i<=n;i++)
        {
            if(isSmith(i))
            System.out.println(i);
        }
    }
}
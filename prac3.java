class prac3
{   int n;
    prac3(int num)
    {
        n=num;
    }
    void armstrong()
    {
        int r,nCopy=n,nCheck=n,s=0,d=0;
        while(nCopy!=0)
        {
            ++d;
            nCopy=nCopy/10;
        }
        while(n!=0)
        {
            r=n%10;
            s=s+(int)Math.pow(r,d);
            n=n/10;
        }
        if(nCheck==s)
        System.out.println(nCheck+" is a MAGIC Number");
    }
    void special()
    {
        int r,s=0,nCopy=n;
        while(nCopy!=0)
        {
            r=nCopy%10;
            int f=1;
            for(int i=1;i<=r;i++)
            {f=f*i;}
            s=s+f;
            nCopy=nCopy/10;
        }
        if(s==n)
        System.out.println(n+" is a SPECIAL Number");
    }
    void magic()
    {
        int r,s=0;
        while(n>9)
        {
            int nCopy=n;
            s=0;
            while(nCopy!=0)
            {
                r=nCopy%10;
                s=s+r;
                nCopy/=10;
            }
            n=s;
        }
        if(n==1)
        System.out.println("It is a MAGIC Number");
    }
}
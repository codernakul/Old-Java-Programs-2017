class Fascinating
{
    int n;
    void input(int nn)
    {
        n=nn;
    }
    void isFascinating()
    {
        int i,r,d,a=0,b=0,c=0,num=n;
        for(i=2;i<=3;i++)
        num=(num*1000+(n*i));
        int nn=num;
        while(nn!=0)
        {
            ++c;
            nn/=10;
        }
        if(c==9)
        {
            for(i=1;i<=9;i++)
            {
                d=num;
                while(d!=0)
                {
                    r=d%10;
                    if(r==i)
                    ++a;
                    d/=10;
                }
                if(a!=1)
                ++b;
            }
            if(b!=0)
            System.out.println(num+" is a Fascinating Number");
            else
            System.out.println(num+" is not a Fascinating Number");
        }
        else
        System.out.println(num+" is not a Fascinating Number B");
    }
}
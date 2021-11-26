class Bumpy
{
    void main(int n)
    {
        int nn=n,r1,r2,num=n,c=0,d=0,a=0;
        while(nn!=0)
        {
            ++c;
            nn/=10;
        }
        while(n!=0)
        {
            r1=n%10;
            r2=(n%100-r1)/10;
            if(r1-r2>0)
            ++a;
            else
            ++d;
            n/=10;
        }
        if(a==(c-1))
        System.out.println("Ascending No.");
        else if(d==(c-1))
        System.out.println("Descending No.");
        else
        System.out.println("Bumpy No.");
    }
}

            
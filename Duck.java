class Duck
{
//hello
    void main(int n)
    {
        int i,r,c=0;
        while(n!=0)
        {
            r=n%10;
            if(r==0)
            ++c;
            n/=10;
        }
        if(c>0)
        System.out.println("Duck");
        else
        System.out.println("Not Duck");
    }
}

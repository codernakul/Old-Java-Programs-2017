class CyclicPrime
{
    boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            ++c;
        }
        if(c==2)
        return true;
        else
        return false;
    }
    int digit(int n)
    {
        int d=0;
        while(n!=0)
        {
            ++d;
            n/=10;
        }
        return d;
    }
    int revert(int n)//Yeh thoda muskil hai!
    {
        int d,l,f;
        d=digit(n);
        l=(n%10)*(int)Math.pow(10,(d-1));//last part of the number
        f=n/10;//first part of the number
        return (l+f);
    }
    void main(int n)
    {
        int c=0,num=n;
        for(int i=1;i<=digit(n);i++)
        {
            n=revert(n);
            if(isPrime(n))
            ++c;
        }
        if(c==digit(n))
        System.out.println(num+" is a Circular Prime Number");
        else
        System.out.println(num+" is not a Circular Prime Number");
    }
}
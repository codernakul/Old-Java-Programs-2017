class DecimalToBinary
{
    int bin(int n)
    {
        int r,x=0,s=0;
        while(n!=0)
        {
            r=n%2;
            s+=r*Math.pow(10,x++);
            n/=2;
        }
        return s;
    }
    void main(String s)
    {
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            System.out.println(bin((int)s.charAt(i)));
        }
    }
}
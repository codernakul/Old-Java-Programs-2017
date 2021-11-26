class BinaryToDecimal
{
    void main(int n)
    {
        int r,x=0,s=0;
        while(n!=0)
        {
            r=n%10;
            s+=r*Math.pow(2,x++);
            n/=10;
        }
        System.out.println(s);
    }
}


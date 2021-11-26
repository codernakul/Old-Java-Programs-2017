class Prime_Factors
{
    /**Enter number here,*/
    public static void main(int n)
    {
        int i=2;
        while(n!=0)
        {
            if(n==1)
            {
                 System.out.println(" |"+n);
                 n=0;
            }
            else if(n%i==0)
            {
                System.out.println(i+"|"+n);
                n=n/i;
            }
            else
            {
                ++i;
            }
        }
    }
}
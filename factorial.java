public class factorial
{
    public static void main(double n)
    {
        double i,f=1,fac=2.43290200817664;long power=18;//10^18
        if(n<=20)
        {
            for(i=1;i<=n;i++)
            {
                f=f*i;
            }
            System.out.println(f);
        }
        else
        {
            for(i=21;i<=n;i++)
            {
                fac=fac*i;
                double integer=Math.floor(fac);
                double decimal=fac-integer;
                int c=-1;
                double num=integer;
                num=Math.round(num);
                System.out.println(num);
                while(num!=0)
                {
                    ++c;
                    num=num/10;
                }
                integer=integer/Math.pow(10,c);
                double now=Math.floor(fac);
                double add=integer-now;
                decimal=decimal+add;
                fac=integer+decimal;
                power=power+c;
            }
            System.out.println(fac+"*10^"+power);
        }
    }
}
public class quadratic
{
    /**Enter the three constants of the Equation ax\u00B2+bx+c,*/
    public static void main(double a,double b,double c)
    {
        double d;int count=0;
        d=(b*b-4*a*c);
        if(d<0)
        {
            d=d*-1;
            count=1;
        }
        if(count==0)
        {
            double root1=(-b+Math.sqrt(d))/2*a;
            double root2=(-b-Math.sqrt(d))/2*a;
            if(d==0)
            {
                System.out.println("The roots of the equation "+a+"x\u00B2+("+b+"x)+"+c+" are real and equal");
                System.out.println("Root's= "+((-b)/2*a));
            }
            else
            {
                double sqroot=Math.sqrt(d);
                double integer=Math.floor(sqroot);
                double check=sqroot-integer;
                if(check==0)
                {
                    System.out.println("The roots of the equation "+a+"x\u00B2+"+b+"x+"+c+" are real and rational");
                    System.out.println("Root's= "+((-b)/2*a)+"\u00B1\u221A"+(d/(2*a)));
                    System.out.println("Root 1= "+root1);
                    System.out.println("Root 2= "+root2);
                }
                else
                {
                    System.out.println("The roots of the equation "+a+"x\u00B2+"+b+"x+"+c+" are real and irrational");
                    System.out.println("Root's= "+((-b)/2*a)+"\u00B1\u221A"+(d/(2*a)));
                    System.out.println("Root 1= "+root1);
                    System.out.println("Root 2= "+root2);
                }
            }
        }
        else
        {
            System.out.println("The roots of the equation "+a+"x\u00B2+"+b+"x+"+c+" are Imaginary(complex)");
            System.out.println("Root's= "+((-b)/2*a)+"\u00B1\u221A"+d+"i");
            System.out.println("OR");
            System.out.println("Root 1= "+((-b)/2*a)+"+"+(Math.sqrt(d)/2*a)+"i");
            System.out.println("Root 2= "+((-b)/2*a)+"-"+(Math.sqrt(d)/2*a)+"i");
        }
    }
}
import java.io.*;
class NumberPhile_Fun
{
    public static void main(int a,int b)throws IOException
    {
        int i,j=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        /*FileWriter fw=new FileWriter("ASCII.txt");
        BufferedWriter bw =new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(fw);*/
        PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("Numbers.txt")));
        for(i=a;i<=b;i++)
        {
            if(isMagic(i)&&isPrime(i))
            {
                ++j;
                s=Integer.toString(i)+",";
                pw.print(s);
                if(j==200)
                {
                    pw.println("");
                    j=0;
                }
            }
        }
        pw.close();
    }

    static boolean isPrime(int n)
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

    static int sum(int n)
    {
        int s=0,r;
        while(n!=0)
        {
            r=n%10;
            s+=r;
            n/=10;
        }
        return s;
    }

    static boolean isMagic(int n)
    {
        int c=0;
        while(n>9)
        {
            c=0;
            c+=sum(n);
            n=c;
        }
        if(n==1)
            return true;
        else
            return false;
    }
}
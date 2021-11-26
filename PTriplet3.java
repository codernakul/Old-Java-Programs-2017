import java.io.*;
class PTriplet3
{
    public static void main(int n)throws IOException
    {
        int i,j,k,q=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("PTriplets3.txt")));
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                for(k=1;k<=n;k++)
                {
                    if(((i*i)+(j*j))==(k*k))
                    {
                        ++q;
                        s="{"+i+"\u00B2"+"+"+j+"\u00B2"+"="+k+"\u00B2"+"}";
                        pw.print(s);
                        if(q==200)
                            pw.println("");
                    }
                }
            }
        }
        pw.close();
    }
}

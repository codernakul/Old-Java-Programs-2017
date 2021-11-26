import java.io.*;
class PTriplets1
{
    public static void main(int n)throws IOException
    {
        int i,j=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("PTriplets1.txt")));
        for(i=1;i<=n;i++)
        {
            ++j;
            s="{"+(2*i+1)+"\u00B2"+"+"+(2*i*(i+1))+"\u00B2"+"="+((2*i*(i+1))+1)+"\u00B2"+"}";
            pw.print(s);
            if(j==200)
            pw.println("");
        }
        pw.close();
    }
}

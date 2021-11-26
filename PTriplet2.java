import java.io.*;
class PTriplet2
{
    public static void main(int n)throws IOException
    {
        int i,j=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("PTriplets2.txt")));
        for(i=1;i<=n;i++){
        for(j=(i+1);j<=n;j++)
        {
            ++j;
            s="{"+(j*j-i*i)+"\u00B2"+"+"+(2*i*j)+"\u00B2"+"="+(j*j+i*i)+"\u00B2"+"}";
            pw.print(s);
            if(j==200)
            pw.println("");
        }}
        pw.close();
    }
}

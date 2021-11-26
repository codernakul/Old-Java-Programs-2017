import java.io.*;
class Fibbonacci_Fun
{
    public static void main(int n)throws IOException
    {
        int i=1,j=0,a=0,b=1,c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        /*FileWriter fw=new FileWriter("ASCII.txt");
        BufferedWriter bw =new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(fw);*/
        PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("Fibbonacci.txt")));
        String ss="0,1,";
        pw.print(ss);
        while(i<=n)
        {
            c=a+b;
                s=Integer.toString(c)+",";
                pw.print(s);
                a=b;
                b=c;
                ++i;
                ++j;
                if(j==200)
                {
                    pw.println("");
                    j=0;
                }
            }
        
        pw.close();
    }
}

import java.io.*;
class ASCII_manipulation
{
    void main(int a,int b)throws IOException
    {
        int i,j=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        /*FileWriter fw=new FileWriter("ASCII.txt");
        BufferedWriter bw =new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(fw);*/
        PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("ASCII.txt")));
        for(i=a;i<=b;i++)
        {
            ++j;
            s=" {"+(char)i+" "+Integer.toString(i)+"} ";
            pw.print(s);
            if(j==200)
            pw.println("");
        }
        pw.close();
    }
}

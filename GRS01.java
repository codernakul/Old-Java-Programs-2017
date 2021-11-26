import java.io.*;
class GRS01
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter NO");
        int a=Integer.parseInt(br.readLine());
        System.out.println(a);
    }
}
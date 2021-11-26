public class Nigma_Decode
{
    static String ss="";
    public static void main(String s,int n)
    {
        char ch;
        s=s.toUpperCase();
        for(int i=0;i<s.length();i++)
        {
            if(n<1)
                n=26;
            ch=s.charAt(i);
            if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='&')
            {
                ss+=" ";
            }
            else
            {
                ch-=n++;
                if((int)ch<65)
                    ch+=26;
                ss+=ch;
            }
        }
        System.out.println(ss);
    }
}
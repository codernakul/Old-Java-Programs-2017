public class Nigma
{
    static String ss="";
    public static void main(String s,int n)
    {
        s=s.toUpperCase();
        char ch;
        for(int i=0;i<s.length();i++)
        {
            if(n>26)
                n=1;
            ch=s.charAt(i);
            if(ch==' ')
            {
                int nn=generate();
                if(nn==1)
                    ss+="!";
                if(nn==2)
                    ss+="@";
                if(nn==3)
                    ss+="#";
                if(nn==4)
                    ss+="$";
                if(nn==5)
                    ss+="&";
            }
            else
            {
                ch+=n++;
                if((int)ch>90)
                    ch-=26;
                ss+=ch;
            }
        }
        System.out.println(ss);
    }

    static int generate()
    {
        int n=(int)Math.round(Math.random()*4)+1;
        return n;
    }
}
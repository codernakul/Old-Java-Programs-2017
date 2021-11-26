class WordRank
{
    void main(String s)
    {
        s=s.toUpperCase();
        char ch;String w="",check;
        int i,j,k,c=0,ans=0;
        for(ch='A';ch<='Z';ch+=1)
        {
            for(i=0;i<s.length();i++)
            {
                if(s.charAt(i)==ch)
                    w=w+s.charAt(i);
            }
        }
        for(i=0;i<w.length();i++)
        {
            for(j=0;j<w.length();j++)
            {
                for(k=0;k<w.length();k++)
                {
                    ++c;
                    check=w.substring(i,i+1)+w.substring(j,j+1)+w.substring(k,k+1);
                    if((w.substring(i,i+1)!=w.substring(j,j+1))&&(w.substring(k,k+1)!=w.substring(j,j+1))&&(w.substring(k,k+1)!=w.substring(i,i+1)));
                    {if(check.equals(s))
                    System.out.println(c);}
                }
            }
        }
        
    }
}
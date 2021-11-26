import java.util.*;
class Rank
{
    char ch[];String word;
    void shift()
    {
        char temp;int l=word.length();
        temp=ch[0];
        for(int i=0;i<l-1;i++)
        {
            ch[i]=ch[i+1];
        }
        ch[l-1]=temp;
    }
    void main()
    {/*
        int i,j,l,fac=1,rank;
        char t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word for its RANK,");
        word=sc.nextLine();
        l=word.length();
        ch=word.toCharArray();
        check=word.toCharArray();
        for(i=0;i<l-1;i++)
        {
            for(j=0;j<l-1-i;j++)
            {
                if((int)ch[i]>(int)ch[i+1])
                {
                    t=ch[i];
                    ch[i]=ch[i+1];
                    ch[i+1]=t;
                }
            }
        }
        for(i=1;i<=l;i++)
        {
            fac=i*fac;
        }
        for(i=1;i<=fac;i++)
        {
            for(i=1;i<=l;)
            {
                if(ch[i]==check[i])
                {
                    ++i;
                }
                else
                {
                    
                }
            }
        }*/
    }
}
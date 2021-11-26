import java.util.*;
class Sort
{
    void main(String s)
    {
        int i,j;String t;
        StringTokenizer st=new StringTokenizer(s);
        int l=st.countTokens();
        String a[]=new String[l];
        for(i=0;i<l;i++)
        {
            a[i]=st.nextToken();
        }
        
        for(i=0;i<l-1;i++)
        {
            for(j=0;j<l-1-i;j++)
            {
                if(a[i].compareTo(a[i+1])>0)
                {
                    t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }
        }
        
        for(i=0;i<l;i++)
        {
            System.out.println(a[i]);
        }
    }
}
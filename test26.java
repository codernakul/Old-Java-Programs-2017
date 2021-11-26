class test26
{
    void main(int n)
    {
        int i,j;
        int l=Integer.toString(n).length();
        i=l-1;
        int a[]=new int [n];
        int nn=n;
        while(nn!=0)
        {
            a[i--]=nn%10;
            nn/=10;
        }
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
        for(i=l;i<n;i++)
        {
            a[i]=0;
            for(j=i-l;j<i;j++)
            {
                a[i]+=a[j];
            }
            if(a[i]==n)
            {
                System.out.println("End");
                break;
            }
        }
        System.out.println("Not End");
    }
}
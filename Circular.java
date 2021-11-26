class Circular//prac6
{
    int a[],s,n;
    Circular(int size,int num,int ar[])
    {
        s=size;
        n=num;
        a=new int[s];
        for(int i=0;i<s;i++)
        a[i]=ar[i];
    }
    void shift()
    {
        int temp;
        temp=a[0];
        for(int i=0;i<s-1;i++)
        {
            a[i]=a[i+1];
        }
        a[s-1]=temp;
    }
    void display()
    {
        for(int i=0;i<s;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    void main()
    {
        if(n<s)
        for(int i=1;i<=n;i++)
        {
            shift();
        }
        display();
    }
}
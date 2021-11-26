class descending
{
    void display(int n)
    {
        System.out.println(n);
        if(n==2)
        System.out.println("1");
        else
        display(n-1);
    }
}
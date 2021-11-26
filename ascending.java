class ascending
{
    void display(int n)
    {
        if(n==2)
        System.out.println("1");
        else
        display(n-1);
        System.out.println(n);
    }
}
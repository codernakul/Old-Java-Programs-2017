class testrandom
{
        /**Enter,
           n is limit
           f is to be found*/
    public static void main(int n,int f)
    {
        int i=-99,c=0;
        while(i!=f)
        {
            i=(int)Math.round(Math.random()*n);
            ++c;
        }
        System.out.println(c+" Found "+f);
    }
}
class Evil
{
    void main(int N)
    {
        int c=0,r=0,s=0,x=0;
        if(N>2||N<100)
        {
            while(N!=0)
        {
            r=N%10;
            if(r==1)
            ++c;
            s+=r*Math.pow(2,x++);
            N/=10;
        }
        if(r%2!=0)
        System.out.println("y"+s);
    }
}
        }
class piano
{
    public static void main(int nn)
    {
        for(int i=1;i<nn;i++)
        {
            int n=(int)Math.round(Math.random()*10);
            if(n==0||n==1)
            System.out.print("S ");
            if(n==2||n==3)
            System.out.print("X ");
            if(n==4||n==5)
            System.out.print("D ");
            if(n==6||n==7)
            System.out.print("M ");
            if(n==8||n==9)
            System.out.print("L ");
            if(i%10==0)
            System.out.println("");
            else
            System.out.print("");
        }
    }
}
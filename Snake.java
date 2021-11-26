import java.util.*;
class Snake
{
    static Scanner sc=new Scanner (System.in);
    static int pt,ct,px=9,py=0,cx=9,cy=0;
    static void display(int npx,int npy,int ncx,int ncy)
    {
        int k=100,c=1,a[][]=new int[10][10];
        for(int i=0;i<10;i++)
        {
            if(c==1)
            {
                for(int j=0;j<10;j++)
                {
                    a[i][j]=k--;
                }
            }
            if(c==-1)
            {
                for(int j=9;j>-1;j--)
                {
                    a[i][j]=k--;
                }
            }
            c=c*-1;
        }
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                if((npx==ncx)&&(npy==ncy)&&(i==npx&&j==npy))
                    System.out.print("\u25A3\t");
                else if(i==npx&&j==npy)
                    System.out.print("\u25A0\t");
                else if(i==ncx&&j==ncy)
                    System.out.print("\u25A1\t");
                else if(i==0&&j==0)
                    System.out.print("\u2691\t");
                else if(i==9&&j==0)
                    System.out.print("\u26DD\t");
                else
                    System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
    }

    static int generate()
    {
        int n=(int)Math.round(Math.random()*10);
        if(n>=1&&n<=6)
            return n;
        else
            return generate();
    }

    /*    int cTurn()
    {
        return generate();
    }

    int playersTurn()
    {
        return generate();
    }*/
    
    static void printMess1()
    {
        System.out.println("\u2755\u2755Enter \'1\' to roll the dice\u2755\u2755");
    }

    static void printMess2()
    {
        System.out.println("\u2755\u2755Invalid Input, Try again\u2755\u2755");
    }

    static void printMess3(int n)
    {
        if(n==1)
            System.out.println("You Got : \u2680 ");
        if(n==2)
            System.out.println("You Got : \u2681 ");
        if(n==3)
            System.out.println("You Got : \u2682 ");
        if(n==4)
            System.out.println("You Got : \u2683 ");
        if(n==5)
            System.out.println("You Got : \u2684 ");
        if(n==6)
            System.out.println("You Got : \u2685 ");
    }

    static void printMess4(int n)
    {
        if(n==1)
            System.out.println("Computer Got : \u2680 ");
        if(n==2)
            System.out.println("Computer Got : \u2681 ");
        if(n==3)
            System.out.println("Computer Got : \u2682 ");
        if(n==4)
            System.out.println("Computer Got : \u2683 ");
        if(n==5)
            System.out.println("Computer Got : \u2684 ");
        if(n==6)
            System.out.println("Computer Got : \u2685 ");
    }

    static boolean choice()
    {
        printMess1();
        if(sc.nextInt()==1)
            return true;
        else
        {
            printMess2();
            return choice();
        }
    }

    public static void main(String args[])
    {
        int pt,ct;
        System.out.println("Hello!!\nAnd welcome to \"SNAKES AND LADDERS:THE GAME\"\nDeveloped by Nakul\nThe rules of the game are quiet simple which are\n1.Your coin will open when you get a \"1\"\n2.Your coin looks like \u25A0 and Your opponents coin is \u25A1\n3.When you and your opponent are on the same place the screen will show \u25A3");
        while(true)
        {
            choice();
            pt=generate();
            printMess3(pt);
            ct=generate();
            printMess4(ct);
            /*if(px==9&&py==0&&pt==1)
            {
            py+=1;
            py=1;
            }
            if(cx==9&&cy==0&&ct==1)
            {
            cy+=1;
            cy=1;
            }*/
            if(px%2==0)
            {
                py-=pt;
                if(py<0)
                { 
                    py=(-1*py)-1;
                    px-=1;
                }
            }
            else if(px%2!=0)
            {
                py+=pt;
                if(py>9)
                {
                    py=19-py;
                    px-=1;
                }
            }
            if(cx%2!=0)
            {
                cy+=ct;
                if(cy>9)
                {
                    cy=19-cy;
                    cx-=1;
                }
            }
            else if(cx%2==0)
            {
                cy-=ct;
                if(cy<0)
                {
                    cy=(-1*cy)-1;
                    cx-=1;
                }
            }
            if(px<=0&&py==0)
            {
                System.out.println("Won");
                System.exit(0);
            }
            else if(cx<=0&&cy==0)
            {
                System.out.println("Lost");
                System.exit(0);
            }
            display(px,py,cx,cy);
        }
    }
    void ladders()
    {
    }
}
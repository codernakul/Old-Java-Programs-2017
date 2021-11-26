import java.util.*;
class Calender
{
    /**
    Please enter a year after 1605
    ~Nakul
     */
    static int c;
    static void week()
    {
        System.out.println("Sun\tMon\tTue\tWed\tThr\tFri\tSat");
    }

    static void print(int m)
    {
        for(int j=1;j<=m;j++)
        {
            System.out.print(j+"\t");
            ++c;
            if(c>=7)
            {
                c=0;
                System.out.println("");
            }
        }
        System.out.println("");
    }

    static boolean leapCheck(int n)
    {
        if((n%4==0&&n%100!=0)||n%400==0)
            return true;
        else 
            return false;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int i,j;
        String m[]={"Nakul","January","Febuary","March","April","May","June","July","August","September","October","November","December"};
        System.out.print("Enter the Year to generate its Calender : ");
        int n=sc.nextInt();
        if(n>1605)
        {
            c=n-1606;
            for(i=1606;i<n;i++)
            {
                if(leapCheck(i))
                    ++c;
            }
            c=c%7;
            System.out.println("\t\t\t|YEAR "+n+"|");
            i=1;
            while(i<=12)
            {
                System.out.println("\t\t\t"+m[i]);
                week();
                for(j=1;j<=c;j++)
                    System.out.print("  \t");
                if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
                {
                    print(31);
                }
                else if(i==4||i==6||i==9||i==11)
                {
                    print(30);
                }
                else if(i==2&&leapCheck(n))
                {
                    print(29);
                }
                else
                {
                    print(28);
                }
                ++i;
            }
        }
    }
}

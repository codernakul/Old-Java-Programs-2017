import java.util.*;
class Morse_dd
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        s=s.trim();
        int len=s.length();
        s=s.toUpperCase();
        char ch;
        for(int i=0;i<len;i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            System.out.print("     ");
            else
            morse(ch);
        }
    }
    public static void morse(char ch)
    {
        if(ch=='A')
        System.out.print("\u2022\u2015  ");
        if(ch=='B')
        System.out.print("\u2015\u2022\u2022\u2022  ");
        if(ch=='C')
        System.out.print("\u2015\u2022\u2015\u2022  ");
        if(ch=='D')
        System.out.print("\u2015\u2022\u2022  ");
        if(ch=='E')
        System.out.print("\u2022  ");
        if(ch=='F')
        System.out.print("\u2022\u2022\u2015\u2022  ");
        if(ch=='G')
        System.out.print("\u2015\u2015\u2022  ");
        if(ch=='H')
        System.out.print("\u2022\u2022\u2022\u2022  ");
        if(ch=='I')
        System.out.print("\u2022\u2022  ");
        if(ch=='J')
        System.out.print("\u2022\u2015\u2015\u2015  ");
        if(ch=='K')
        System.out.print("\u2015\u2022\u2015  ");
        if(ch=='L')
        System.out.print("\u2022\u2015\u2022\u2022  ");
        if(ch=='M')
        System.out.print("\u2015\u2015  ");
        if(ch=='N')
        System.out.print("\u2015\u2022  ");
        if(ch=='O')
        System.out.print("\u2015\u2015\u2015  ");
        if(ch=='P')
        System.out.print("\u2022\u2015\u2015\u2022  ");
        if(ch=='Q')
        System.out.print("\u2015\u2015\u2022\u2015  ");
        if(ch=='R')
        System.out.print("\u2022\u2015\u2022  ");
        if(ch=='S')
        System.out.print("\u2022\u2022\u2022  ");
        if(ch=='T')
        System.out.print("\u2015  ");
        if(ch=='U')
        System.out.print("\u2022\u2022\u2015  ");
        if(ch=='V')
        System.out.print("\u2022\u2022\u2022\u2015  ");
        if(ch=='W')
        System.out.print("\u2022\u2015\u2015  ");
        if(ch=='X')
        System.out.print("\u2015\u2022\u2022\u2015  ");
        if(ch=='Y')
        System.out.print("\u2015\u2022\u2015\u2015  ");
        if(ch=='Z')
        System.out.print("\u2015\u2015\u2022\u2022  ");
        if(ch=='1')
        System.out.print("\u2022\u2015\u2015\u2015\u2015  ");
        if(ch=='2')
        System.out.print("\u2022\u2022\u2015\u2015\u2015  ");
        if(ch=='3')
        System.out.print("\u2022\u2022\u2022\u2015\u2015  ");
        if(ch=='4')
        System.out.print("\u2022\u2022\u2022\u2022\u2015  ");
        if(ch=='5')
        System.out.print("\u2022\u2022\u2022\u2022\u2022  ");
        if(ch=='6')
        System.out.print("\u2015\u2022\u2022\u2022\u2022  ");
        if(ch=='7')
        System.out.print("\u2015\u2015\u2022\u2022\u2022  ");
        if(ch=='8')
        System.out.print("\u2015\u2015\u2015\u2022\u2022  ");
        if(ch=='9')
        System.out.print("\u2015\u2015\u2015\u2015\u2022  ");
        if(ch=='0')
        System.out.print("\u2015\u2015\u2015\u2015\u2015  ");
    }
}
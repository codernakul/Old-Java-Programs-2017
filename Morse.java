import java.util.*;
class Morse
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
            System.out.print("  ");
            else
            morse(ch);
        }
    }
    public static void morse(char ch)
    {
        if(ch=='A')
        System.out.print("01 ");
        if(ch=='B')
        System.out.print("1000 ");
        if(ch=='C')
        System.out.print("1010 ");
        if(ch=='D')
        System.out.print("100 ");
        if(ch=='E')
        System.out.print("0 ");
        if(ch=='F')
        System.out.print("0010 ");
        if(ch=='G')
        System.out.print("110 ");
        if(ch=='H')
        System.out.print("0000 ");
        if(ch=='I')
        System.out.print("00 ");
        if(ch=='J')
        System.out.print("0111 ");
        if(ch=='K')
        System.out.print("101 ");
        if(ch=='L')
        System.out.print("0100 ");
        if(ch=='M')
        System.out.print("11 ");
        if(ch=='N')
        System.out.print("10 ");
        if(ch=='O')
        System.out.print("111 ");
        if(ch=='P')
        System.out.print("0110 ");
        if(ch=='Q')
        System.out.print("1101 ");
        if(ch=='R')
        System.out.print("010 ");
        if(ch=='S')
        System.out.print("000 ");
        if(ch=='T')
        System.out.print("1 ");
        if(ch=='U')
        System.out.print("001 ");
        if(ch=='V')
        System.out.print("0001 ");
        if(ch=='W')
        System.out.print("011 ");
        if(ch=='X')
        System.out.print("1001 ");
        if(ch=='Y')
        System.out.print("1011 ");
        if(ch=='Z')
        System.out.print("1100 ");
        if(ch=='1')
        System.out.print("01111 ");
        if(ch=='2')
        System.out.print("00111 ");
        if(ch=='3')
        System.out.print("00011 ");
        if(ch=='4')
        System.out.print("00001 ");
        if(ch=='5')
        System.out.print("00000 ");
        if(ch=='6')
        System.out.print("10000 ");
        if(ch=='7')
        System.out.print("11000 ");
        if(ch=='8')
        System.out.print("11100 ");
        if(ch=='9')
        System.out.print("11110 ");
        if(ch=='0')
        System.out.print("11111 ");
    }
}
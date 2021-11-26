import java.io.*;
import java.util.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
class Password
{
    static String pw="",name;
    static int number()
    {
        return (int)Math.round(Math.random()*10);
    }
    static char symbol()
    {
        int i=(int)Math.round(Math.random()*3);
        if(i==1)
        return '!';
        if(i==2)
        return '#';
        if(i==3)
        return '_';
        else
        return '&';
    }
    static char upper()
    {
        int c=1,s=0;
        while(c<=3)
        {
            ++c;
            s+=(int)Math.round(Math.random()*10);
        }
        if(s>25)
        s=s-5;
        return (char)(s+65);
    }
    static char lower()
    {
        int c=1,s=0;
        while(c<=3)
        {
            ++c;
            s+=(int)Math.round(Math.random()*10);
        }
        if(s>25)
        s=s-5;
        return (char)(s+97);
    }
    static void cPW()
    {
        int ch;
        pw=pw+lower();
        for(int i=1;i<=15;i++)
        {
            ch=(int)Math.round(Math.random()*3);
            if(ch==0)
            pw=pw+lower();
            if(ch==1)
            pw=pw+upper();
            if(ch==2)
            pw=pw+number();
            if(ch==3)
            pw=pw+symbol();
            //System.out.println(pw);
        }
    }
    /*static void fileMake()throws IOException
    {
        PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(name)));
        pw.print(pw);
        pw.println();
        pw.close();
    }*/
    public static void main(String args[])throws IOException
    {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("[JAVA] Enter NAME for Password");
        name=sc.nextLine();
        name=name.trim();
        name=name+" Password File.txt";*/
        cPW();
        /*PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(name)));
        pw.print(pw);
        pw.close();
        fileMake();*/
        System.out.println("[JAVA] Your password is - "+pw+"\n[JAVA] It has been copied to clipboard");
        clipIt();
        //System.out.println("[JAVA] It has been saved in .txt file with name - "+name+" in your USER folder");
    }
    static void clipIt()
    {
        //String str = "String destined for clipboard"; here pw

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		StringSelection strSel = new StringSelection(pw);
		clipboard.setContents(strSel, null); 
    }
}
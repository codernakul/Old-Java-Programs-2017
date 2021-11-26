import java.io.*;
import java.util.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
public class ADB
{
    public static void main(String args[])
    {
        String name,choice="y",pass="";int i=1;
        Scanner sc=new Scanner(System.in);
        //System.out.println("");
        System.out.println("[ADB] Enter name for file");
        name=sc.nextLine();
        while(choice.equalsIgnoreCase("y"))
        {
            pass="adb exec-out screencap -p >"+name+""+i+".png";
            System.out.println(/*"adb exec-out screencap -p >"+name+""+i+".png"*/pass);
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Clipboard clipboard = toolkit.getSystemClipboard();
            StringSelection strSel = new StringSelection(pass);
            clipboard.setContents(strSel, null);
            ++i;
            System.out.println("[ADB] Do you want to continue - [ Y or N ] ?");
            choice=sc.nextLine();
        }
        System.out.println("[ADB] Operation Over, BYE!!");
    }
}
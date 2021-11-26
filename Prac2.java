import java.io.*;
class Prac2
{
    public static void main(String arg[])throws IOException
    {
        int i,j,vwls,con,p,l;
        String str,word,temp; char ch,ch1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a paragraph : ");
        str=br.readLine();
        l=str.length();
        ch=str.charAt(l-1);
        System.out.println("\nOUTPUT:");
        if(ch != '.' && ch != '?')
            System.out.println("INVALID INPUT");
        else{
            p = vwls = con = 0;
            temp = str+" ";
            str = "";
            for(i=0;i < temp.length();i++){
                ch  = temp.charAt(i);
                if(ch == ' '){
                    word = temp.substring(p,i);
                    ch1 = word.charAt(0);
                    word = Character.toUpperCase(ch1)+word.substring(1);
                    str+= word+" ";
                    p = i + 1;
                } }
            System.out.println("\n"+str);
            System.out.print("\nWord");
            for(j= 15 - 4; j>=1;j--)
                System.out.print(" ");
            System.out.println("\tVowels\tConsonants");
            p=0;
            for(i=0;i < l;i++)
            {
                ch  = str.charAt(i);
                if( ch != ' ' && ch != '.' && ch != '?')
                {
                    if((ch>=65 && ch <= 90) || (ch>=97 && ch<=122))
                    {
                        if("aeiouAEIOU".indexOf(ch) != -1)
                            vwls++;
                        else
                            con++;
                    } }
                else {
                    word = str.substring(p,i);
                    System.out.print(word);
                    for(j= 15 - word.length(); j>=1;j--)
                        System.out.print(" ");
                    System.out.println("\t   "+vwls+"\t   "+con);
                    p = i + 1;
                    vwls = con = 0;
                }}}}}

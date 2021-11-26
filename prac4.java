/* reverseWord()-reverse every word with odd length
 * insertWord()-after every vowel in sent
 * display()-display the sentence */
class prac4
{
    StringBuffer sent,word;
    prac4(String s,String Word)
    {
        s=s.trim();
        sent=new StringBuffer(s);
        word=new StringBuffer(Word);
    }
    void reverseWord()
    {
        int l;String w;
        sent.insert(0," ");
        sent.insert((sent.length()-1)," ");
        for(int i=0;i<sent.length()-1;i++)
        {
            if(sent.charAt(i)==' '&&Character.isLetter(sent.charAt(i+1)))
            {
                l=sent.indexOf(" ",(i+1));
                w=sent.substring((i+1),l);
                if(w.length()%2==1)
                {
                    StringBuffer wRev=new StringBuffer(w);
                    wRev.reverse();
                    sent.delete((i+1),l);
                    sent.insert((i+1),wRev);
                    i=l-1;
                }
            }
        }
    }
}

    
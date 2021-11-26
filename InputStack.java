import java.io.*;
class stack
{
    int st[],s,top,size;
    stack(int s)
    {
        size=s;
        top=-1;
        st=new int[size];
    }
    void push(int n)
    {
        if(top==size-1)
        System.out.println("Stack Overflow");
        else
        st[++top]=n;
    }
    int pop()
    {
        return st[top--];
    }
    boolean isEmpty()
    {
        return top==-1;
    }
}
public class InputStack
{
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s,n=0,ans;
        System.out.println("Enter the size of Stack");
        s=Integer.parseInt(br.readLine());
        stack a=new stack(s);
        do
        {
            System.out.println("Enter a Number");
            n=Integer.parseInt(br.readLine());
            a.push(n);
            System.out.println("Enter 1 to continue");
            ans=Integer.parseInt(br.readLine());
        }while(ans==1);
        System.out.println("Display");
        do
        {
            if(a.isEmpty())
            {
                System.out.println("Stack UnderFlow");
                System.exit(1);
            }
            else 
            {
                n=a.pop();
                System.out.println("Value="+n);
                System.out.println("Enter 1 to continue");
                ans=Integer.parseInt(br.readLine());
            }
        }while(ans==1);
    }
}
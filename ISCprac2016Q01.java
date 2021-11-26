import java.io.*;
class ISCprac2016Q01
{
    public static void main(String arg[])throws IOException
    {
        int l,i,n;	
        boolean flag = true;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number : ");
        String num = br.readLine();
        l = num.length();
        for(i = 0; i < l; i++){
            String str = num.substring(i,l) + num.substring(0,i);
            n = Integer.parseInt(str);
            if(!isPrime(n)){
                flag = false;
                break;
            }}
        if(flag)
            System.out.println(num + " IS A CIRCULAR PRIME");   
        else
            System.out.println(num + " IS NOT A CIRCULAR PRIME");  
    }

    private static boolean isPrime(int p){
        for(int i = 2; i <= p/2; i++){
            if(p%i == 0)
                return false;
        }
        return true;
    }}

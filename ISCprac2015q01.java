import java.util.*;
class ISCprac2015q01
{
    public static void main(String args[])
    throws InputMismatchException{
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter M and N where M is between 100 and 10000 and N is less than 100");
        int m=scan.nextInt();
        byte n = scan.nextByte();

        if(m < 100 || m > 10000){
            System.out.println("INVALID INPUT");
        }
        else if(n >=100){
            System.out.println("INVALID INPUT");
        }
        else{
            int p = m,t;
            byte sum,nod;
            do{
                t = p++; 
                sum = 0;
                nod = 0;
                while(t > 0){
                    sum = (byte)(sum + t%10); 
                    t = t/10;
                    nod++;
                }}while(sum != n); 
            System.out.println("The required number = "+(p-1));
            System.out.println("Total number of digits = "+(nod));
        }}}

import java.util.*;
class arrangeDig{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Digits to be arranged");
        int n=sc.nextInt();
        int d,num=n;
        for(int i=0;i<10;i++)
        {
            num=n;
            while(num>0)
            {
                d=num%10;
                if(d==i)
                {
                    System.out.print(d+",");
                }
                num=num/10;
            }
        }
        System.out.println();
    }}

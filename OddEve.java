import java.util.*;
class OddEve
{
    Scanner sc=new Scanner (System.in);
    int choice,inning,run1=0,run=0;//run1 own, run comp
    void main()
    {
        load();
        System.out.println("Hello there,");
        System.out.println("and welcome ;p to the game \"OddnEve\"");
        System.out.println(":| ~~MADE BY NAKUL SINGH~~ :|");
        System.out.println("");
        System.out.println("Rules are, just follow the instructions and input range everywhere is 1 to 10,");
        System.out.println("unless specified in certain places :p");
        System.out.println("");
        System.out.println("After every entry you have to hit ENTER :o");
        System.out.println("Note:Invalid input can crash the PROGRAM :o so be careful ;)");
        System.out.println("");
        System.out.println("--->TOSS<---");
        System.out.println("Enter 1 to choose ODD and 2 for EVE");
        choice=sc.nextInt();
        System.out.println("Input a number for Toss in range 1-10");
        if(toss()==choice) //done
        {
            System.out.println("!!You WON :) the TOSS!!");
            System.out.println("");
            System.out.println("To Bat first input 1 and 2 for Fielding first");
            inning=sc.nextInt();
        }
        else
        {
            System.out.println("!!You LOST :( the TOSS!!");
            if(checkOdd(generate()))
            {
                inning=1;
                System.out.println("You will Bat first");
            }
            else
            {
                inning=2;
                System.out.println("You will Field first");
            }
        }
        System.out.println("");
        if(inning==1)
        {
            System.out.println("Press the number (b/w 1to10) you want to spawn and hit enter,");
            System.out.println("Repeat till you are !OUT!");
            System.out.println("!!!Start BATTING!!!");
            bat();
            System.out.println("|---------------|");    
            System.out.println("|    !!OUT!!    |");
            System.out.println("|---------------|");
            System.out.println("First Innings Over \t Your Score "+run1);
            System.out.println("");
            System.out.println("Now its time to FIELD :O");
            System.out.println("");
            System.out.println("Press the number (b/w 1to10) you want to spawn and hit enter,");
            System.out.println("Repeat till Computer is !OUT!");
            System.out.println("!!!Start BOWLING!!!");
            if(bowl()>(run+1))
                System.out.println("!!You LOST!!");
            else
            {
                System.out.println("|---------------|");    
                System.out.println("|    !!OUT!!    |");
                System.out.println("|---------------|");
                System.out.println("");
                System.out.println("!!CONGRATULATIONS :P You WON!!");
            }
            System.out.println("");
            System.out.println("|---------------|");    
            System.out.println("| !!GAME OVER!! |");
            System.out.println("|---------------|");
        }
        else if(inning==2)
        {
            System.out.println("Press the number (b/w 1to10) you want to spawn and hit enter,");
            System.out.println("Repeat till Computer is !OUT!");
            System.out.println("!!!Start BOWLING!!!");
            bowl();
            System.out.println("|---------------|");    
            System.out.println("|    !!OUT!!    |");
            System.out.println("|---------------|");
            System.out.println("");
            System.out.println("First Innings Over \t Computers Score "+run);
            System.out.println("");
            System.out.println("Now its time to BAT :O");
            if(bat()>(run+1))
                System.out.println("!!CONGRATULATIONS :P You WON!!");
            else
            {
                System.out.println("|---------------|");    
                System.out.println("|    !!OUT!!    |");
                System.out.println("|---------------|");
                System.out.println("");
                System.out.println("!!You LOST!!");
            }
            System.out.println("");
            System.out.println("|---------------|");    
            System.out.println("| !!GAME OVER!! |");
            System.out.println("|---------------|");
        }
    }

    int generate()
    {
        int n=((int)Math.round(Math.random()*9)+1);
        return n;
    }

    int inputUser()
    {
        return sc.nextInt();
    }

    int toss()
    {
        if(checkOdd(generate()+inputUser()))
            return 1;
        else 
            return 2;
    }

    boolean checkOdd(int n)
    {
        if(n%2!=0)
            return true;
        else
            return false;
    }

    int bat()
    {
        int a,b; 
        while((b=generate())!=(a=inputUser()))
        {
            if(a>0&&a<11)
                run1=run1+a;
            status(a,b,run1);
            if((run1>run)&&inning==2)
                break;
        }
        status(a,b,run1);
        return run1;
    }

    int bowl()
    {
        int a,b;
        while((b=generate())!=(a=inputUser()))
        {
            if(a>0&&a<11)
                run=run+b;
            status(a,b,run);
            if((run>run1)&&inning==1)
                break;
        }
        status(a,b,run);
        return run;
    }

    void status(int a,int b,int r)
    {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Computers Move");
        compFig(b);
        System.out.println("\t\t\t\t\t\tYour Move");
        ownFig(a);
        System.out.println("Runs "+r);
        System.out.println("----------------------------------------------------------------------------");
    }

    void load()
    {
        double i;
        System.out.println("   Loading");
        for(i=0.1;i<=10000000;i+=0.1);
        System.out.print(":");
        for(i=0.1;i<=10000000;i+=0.1);
        System.out.print(":");
        for(i=0.1;i<=10000000;i+=0.1);
        System.out.print(":");
        for(i=0.1;i<=10000000;i+=0.1);
        System.out.print(":");
        for(i=0.1;i<=10000000;i+=0.1);
        System.out.print(":");
        for(i=0.1;i<=10000000;i+=0.1);
        System.out.print(":");
        for(i=0.1;i<=10000000;i+=0.1);
        System.out.print(":");
        for(i=0.1;i<=10000000;i+=0.1);
        System.out.print(":");
        for(i=0.1;i<=10000000;i+=0.1);
        System.out.print(":");
        for(i=0.1;i<=10000000;i+=0.1);
        System.out.print(":");
        for(i=0.1;i<=10000000;i+=0.1);
        System.out.print(":");
        for(i=0.1;i<=10000000;i+=0.1);
        System.out.print(":");
        for(i=0.1;i<=10000000;i+=0.1);
        System.out.print(":");
        for(i=0.1;i<=10000000;i+=0.1);
        System.out.print(":");
        for(i=0.1;i<=10000000;i+=0.1);
        System.out.println(":");
        System.out.println("");
    }

    void compFig(int n)
    {
        if(n==1)
        {
            System.out.println("                   __");
            System.out.println("                  |@@|");
            System.out.println("                  |@@|");
            System.out.println("                   -- ");
            System.out.println("                  |  |");
            System.out.println("                  |  |");
            System.out.println(" __    __    __    -- ");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println("|__|  |__|  |__|  |  |");
            System.out.println("|__|__|__|__|__|__|--|");
            System.out.println("|                    |");
            System.out.println("|                ____|");
            System.out.println("|               |___/\\  ");
            System.out.println("|                   \\ \\ ");
            System.out.println("|                    \\ \\");
            System.out.println("|____________________|__|");
        }
        if(n==2)
        {
            System.out.println("             __    __");
            System.out.println("            |@@|  |@@|");
            System.out.println("            |@@|  |@@|");
            System.out.println("             --    -- ");
            System.out.println("            |  |  |  |");
            System.out.println("            |  |  |  |");
            System.out.println(" __    __    --    -- ");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println("|__|  |__|  |  |  |  |");
            System.out.println("|__|__|__|__|--|__|--|");
            System.out.println("|                    |");
            System.out.println("|                ____|");
            System.out.println("|               |___/\\  ");
            System.out.println("|                   \\ \\ ");
            System.out.println("|                    \\ \\");
            System.out.println("|____________________|__|");
        }
        if(n==3)
        {
            System.out.println("       __    __    __");
            System.out.println("      |@@|  |@@|  |@@|");
            System.out.println("      |@@|  |@@|  |@@|");
            System.out.println("       --    --    -- ");
            System.out.println("      |  |  |  |  |  |");
            System.out.println("      |  |  |  |  |  |");
            System.out.println(" __    --    --    -- ");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println("|__|  |  |  |  |  |  |");
            System.out.println("|__|__|--|__|--|__|--|");
            System.out.println("|                    |");
            System.out.println("|                ____|");
            System.out.println("|               |___/\\  ");
            System.out.println("|                   \\ \\ ");
            System.out.println("|                    \\ \\");
            System.out.println("|____________________|__|");
        }
        if(n==4)
        {
            System.out.println(" __    __    __    __");
            System.out.println("|@@|  |@@|  |@@|  |@@|");
            System.out.println("|@@|  |@@|  |@@|  |@@|");
            System.out.println(" --    --    --    -- ");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println(" --    --    --    -- ");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println("|--|__|--|__|--|__|--|");
            System.out.println("|                    |");
            System.out.println("|                ____|");
            System.out.println("|               |___/\\  ");
            System.out.println("|                   \\ \\ ");
            System.out.println("|                    \\ \\");
            System.out.println("|____________________|__|");
        }
        if(n==5)
        {
            System.out.println(" __    __    __    __");
            System.out.println("|@@|  |@@|  |@@|  |@@|");
            System.out.println("|@@|  |@@|  |@@|  |@@|");
            System.out.println(" --    --    --    -- ");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println(" --    --    --    -- ");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println("|--|__|--|__|--|__|--|    ___");
            System.out.println("|                    |   /@@/");
            System.out.println("|                    |  /@@/");
            System.out.println("|                    | /--/");
            System.out.println("|                    |/  /");
            System.out.println("|                       /");
            System.out.println("|_______________________|");
        }
        if(n==6)
        {
            System.out.println(" __    __    __    __ ");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println("|__|  |__|  |__|  |__|");
            System.out.println("|__|__|__|__|__|__|__|    ___");
            System.out.println("|                    |   /@@/");
            System.out.println("|                    |  /@@/");
            System.out.println("|                    | /--/");
            System.out.println("|                    |/  /");
            System.out.println("|                       /");
            System.out.println("|_______________________|");
        }
        if(n==7)
        {
            System.out.println("                   __");
            System.out.println("                  |@@|");
            System.out.println("                  |@@|");
            System.out.println("                   -- ");
            System.out.println("                  |  |");
            System.out.println("                  |  |");
            System.out.println(" __    __    __    -- ");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println("|__|  |__|  |__|  |  |");
            System.out.println("|__|__|__|__|__|__|--|    ___");
            System.out.println("|                    |   /@@/");
            System.out.println("|                    |  /@@/");
            System.out.println("|                    | /--/");
            System.out.println("|                    |/  /");
            System.out.println("|                       /");
            System.out.println("|_______________________|");
        }
        if(n==8)
        {
            System.out.println("             __    __");
            System.out.println("            |@@|  |@@|");
            System.out.println("            |@@|  |@@|");
            System.out.println("             --    -- ");
            System.out.println("            |  |  |  |");
            System.out.println("            |  |  |  |");
            System.out.println(" __    __    --    -- ");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println("|__|  |__|  |  |  |  |");
            System.out.println("|__|__|__|__|--|__|--|    ___");
            System.out.println("|                    |   /@@/");
            System.out.println("|                    |  /@@/");
            System.out.println("|                    | /--/");
            System.out.println("|                    |/  /");
            System.out.println("|                       /");
            System.out.println("|_______________________|");
        }
        if(n==9)
        {
            System.out.println("       __    __    __");
            System.out.println("      |@@|  |@@|  |@@|");
            System.out.println("      |@@|  |@@|  |@@|");
            System.out.println("       --    --    -- ");
            System.out.println("      |  |  |  |  |  |");
            System.out.println("      |  |  |  |  |  |");
            System.out.println(" __    --    --    -- ");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println("|__|  |  |  |  |  |  |");
            System.out.println("|__|__|--|__|--|__|--|    ___");
            System.out.println("|                    |   /@@/");
            System.out.println("|                    |  /@@/");
            System.out.println("|                    | /--/");
            System.out.println("|                    |/  /");
            System.out.println("|                       /");
            System.out.println("|_______________________|");
        }
        if(n==10)
        {
            System.out.println(" __    __    __    __ ");
            System.out.println("|  |  |  |  |  |  |  |");
            System.out.println("|__|  |__|  |__|  |__|");
            System.out.println("|__|__|__|__|__|__|__|");
            System.out.println("|                    |");
            System.out.println("|                ____|");
            System.out.println("|               |___/\\  ");
            System.out.println("|                   \\ \\ ");
            System.out.println("|                    \\ \\");
            System.out.println("|____________________|__|");
        }
    }

    void ownFig(int n)
    {
        if(n==1)
        {
            System.out.println("\t\t\t\t\t\t                   __");
            System.out.println("\t\t\t\t\t\t                  |@@|");
            System.out.println("\t\t\t\t\t\t                  |@@|");
            System.out.println("\t\t\t\t\t\t                   -- ");
            System.out.println("\t\t\t\t\t\t                  |  |");
            System.out.println("\t\t\t\t\t\t                  |  |");
            System.out.println("\t\t\t\t\t\t __    __    __    -- ");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|__|  |__|  |__|  |  |");
            System.out.println("\t\t\t\t\t\t|__|__|__|__|__|__|--|");
            System.out.println("\t\t\t\t\t\t|                    |");
            System.out.println("\t\t\t\t\t\t|                ____|");
            System.out.println("\t\t\t\t\t\t|               |___/\\  ");
            System.out.println("\t\t\t\t\t\t|                   \\ \\ ");
            System.out.println("\t\t\t\t\t\t|                    \\ \\");
            System.out.println("\t\t\t\t\t\t|____________________|__|");
        }
        if(n==2)
        {
            System.out.println("\t\t\t\t\t\t             __    __");
            System.out.println("\t\t\t\t\t\t            |@@|  |@@|");
            System.out.println("\t\t\t\t\t\t            |@@|  |@@|");
            System.out.println("\t\t\t\t\t\t             --    -- ");
            System.out.println("\t\t\t\t\t\t            |  |  |  |");
            System.out.println("\t\t\t\t\t\t            |  |  |  |");
            System.out.println("\t\t\t\t\t\t __    __    --    -- ");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|__|  |__|  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|__|__|__|__|--|__|--|");
            System.out.println("\t\t\t\t\t\t|                    |");
            System.out.println("\t\t\t\t\t\t|                ____|");
            System.out.println("\t\t\t\t\t\t|               |___/\\  ");
            System.out.println("\t\t\t\t\t\t|                   \\ \\ ");
            System.out.println("\t\t\t\t\t\t|                    \\ \\");
            System.out.println("\t\t\t\t\t\t|____________________|__|");
        }
        if(n==3)
        {
            System.out.println("\t\t\t\t\t\t       __    __    __");
            System.out.println("\t\t\t\t\t\t      |@@|  |@@|  |@@|");
            System.out.println("\t\t\t\t\t\t      |@@|  |@@|  |@@|");
            System.out.println("\t\t\t\t\t\t       --    --    -- ");
            System.out.println("\t\t\t\t\t\t      |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t      |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t __    --    --    -- ");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|__|  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|__|__|--|__|--|__|--|");
            System.out.println("\t\t\t\t\t\t|                    |");
            System.out.println("\t\t\t\t\t\t|                ____|");
            System.out.println("\t\t\t\t\t\t|               |___/\\  ");
            System.out.println("\t\t\t\t\t\t|                   \\ \\ ");
            System.out.println("\t\t\t\t\t\t|                    \\ \\");
            System.out.println("\t\t\t\t\t\t|____________________|__|");
        }
        if(n==4)
        {
            System.out.println("\t\t\t\t\t\t __    __    __    __");
            System.out.println("\t\t\t\t\t\t|@@|  |@@|  |@@|  |@@|");
            System.out.println("\t\t\t\t\t\t|@@|  |@@|  |@@|  |@@|");
            System.out.println("\t\t\t\t\t\t --    --    --    -- ");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t --    --    --    -- ");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|--|__|--|__|--|__|--|");
            System.out.println("\t\t\t\t\t\t|                    |");
            System.out.println("\t\t\t\t\t\t|                ____|");
            System.out.println("\t\t\t\t\t\t|               |___/\\  ");
            System.out.println("\t\t\t\t\t\t|                   \\ \\ ");
            System.out.println("\t\t\t\t\t\t|                    \\ \\");
            System.out.println("\t\t\t\t\t\t|____________________|__|");
        }
        if(n==5)
        {
            System.out.println("\t\t\t\t\t\t __    __    __    __");
            System.out.println("\t\t\t\t\t\t|@@|  |@@|  |@@|  |@@|");
            System.out.println("\t\t\t\t\t\t|@@|  |@@|  |@@|  |@@|");
            System.out.println("\t\t\t\t\t\t --    --    --    -- ");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t --    --    --    -- ");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|--|__|--|__|--|__|--|    ___");
            System.out.println("\t\t\t\t\t\t|                    |   /@@/");
            System.out.println("\t\t\t\t\t\t|                    |  /@@/");
            System.out.println("\t\t\t\t\t\t|                    | /--/");
            System.out.println("\t\t\t\t\t\t|                    |/  /");
            System.out.println("\t\t\t\t\t\t|                       /");
            System.out.println("\t\t\t\t\t\t|_______________________|");
        }
        if(n==6)
        {
            System.out.println("\t\t\t\t\t\t __    __    __    __ ");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|__|  |__|  |__|  |__|");
            System.out.println("\t\t\t\t\t\t|__|__|__|__|__|__|__|    ___");
            System.out.println("\t\t\t\t\t\t|                    |   /@@/");
            System.out.println("\t\t\t\t\t\t|                    |  /@@/");
            System.out.println("\t\t\t\t\t\t|                    | /--/");
            System.out.println("\t\t\t\t\t\t|                    |/  /");
            System.out.println("\t\t\t\t\t\t|                       /");
            System.out.println("\t\t\t\t\t\t|_______________________|");
        }
        if(n==7)
        {
            System.out.println("\t\t\t\t\t\t                   __");
            System.out.println("\t\t\t\t\t\t                  |@@|");
            System.out.println("\t\t\t\t\t\t                  |@@|");
            System.out.println("\t\t\t\t\t\t                   -- ");
            System.out.println("\t\t\t\t\t\t                  |  |");
            System.out.println("\t\t\t\t\t\t                  |  |");
            System.out.println("\t\t\t\t\t\t __    __    __    -- ");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|__|  |__|  |__|  |  |");
            System.out.println("\t\t\t\t\t\t|__|__|__|__|__|__|--|    ___");
            System.out.println("\t\t\t\t\t\t|                    |   /@@/");
            System.out.println("\t\t\t\t\t\t|                    |  /@@/");
            System.out.println("\t\t\t\t\t\t|                    | /--/");
            System.out.println("\t\t\t\t\t\t|                    |/  /");
            System.out.println("\t\t\t\t\t\t|                       /");
            System.out.println("\t\t\t\t\t\t|_______________________|");
        }
        if(n==8)
        {
            System.out.println("\t\t\t\t\t\t             __    __");
            System.out.println("\t\t\t\t\t\t            |@@|  |@@|");
            System.out.println("\t\t\t\t\t\t            |@@|  |@@|");
            System.out.println("\t\t\t\t\t\t             --    -- ");
            System.out.println("\t\t\t\t\t\t            |  |  |  |");
            System.out.println("\t\t\t\t\t\t            |  |  |  |");
            System.out.println("\t\t\t\t\t\t __    __    --    -- ");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|__|  |__|  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|__|__|__|__|--|__|--|    ___");
            System.out.println("\t\t\t\t\t\t|                    |   /@@/");
            System.out.println("\t\t\t\t\t\t|                    |  /@@/");
            System.out.println("\t\t\t\t\t\t|                    | /--/");
            System.out.println("\t\t\t\t\t\t|                    |/  /");
            System.out.println("\t\t\t\t\t\t|                       /");
            System.out.println("\t\t\t\t\t\t|_______________________|");
        }
        if(n==9)
        {
            System.out.println("\t\t\t\t\t\t       __    __    __");
            System.out.println("\t\t\t\t\t\t      |@@|  |@@|  |@@|");
            System.out.println("\t\t\t\t\t\t      |@@|  |@@|  |@@|");
            System.out.println("\t\t\t\t\t\t       --    --    -- ");
            System.out.println("\t\t\t\t\t\t      |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t      |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t __    --    --    -- ");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|__|  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|__|__|--|__|--|__|--|    ___");
            System.out.println("\t\t\t\t\t\t|                    |   /@@/");
            System.out.println("\t\t\t\t\t\t|                    |  /@@/");
            System.out.println("\t\t\t\t\t\t|                    | /--/");
            System.out.println("\t\t\t\t\t\t|                    |/  /");
            System.out.println("\t\t\t\t\t\t|                       /");
            System.out.println("\t\t\t\t\t\t|_______________________|");
        }
        if(n==10)
        {
            System.out.println("\t\t\t\t\t\t __    __    __    __ ");
            System.out.println("\t\t\t\t\t\t|  |  |  |  |  |  |  |");
            System.out.println("\t\t\t\t\t\t|__|  |__|  |__|  |__|");
            System.out.println("\t\t\t\t\t\t|__|__|__|__|__|__|__|");
            System.out.println("\t\t\t\t\t\t|                    |");
            System.out.println("\t\t\t\t\t\t|                ____|");
            System.out.println("\t\t\t\t\t\t|               |___/\\  ");
            System.out.println("\t\t\t\t\t\t|                   \\ \\ ");
            System.out.println("\t\t\t\t\t\t|                    \\ \\");
            System.out.println("\t\t\t\t\t\t|____________________|__|");
        }
    }
}

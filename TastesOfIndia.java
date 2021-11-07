import java.util.*;
class TastesOfIndia
{//class opened
    Scanner sc = new Scanner(System.in);
    String a[] = new String[1000];//initialising array for storing names of items ordered
    double b[] = new double[1000];//initialising array for storing price of items ordered
    int qty[] = new int[1000];//initialising array for storing quantity of items ordered
    double gt[] = new double[1000];//initialising array for storing total price of items ordered
    int d = 0;    
    int c = 0;
    int num = 0;    
    public void main()
    {//main() method opened
        String opt = "";
        int ch = 0;
        double s = 0.00;
        System.out.println("\f");
        if(c == 0) 
        {
            System.out.println();
            System.out.println("\t ~~~~~~~~~~~ WELCOME TO THE TASTES OF INDIA ~~~~~~~~~~~\t");
            System.out.println();
        }
        do
        {                      
           System.out.println("\t =================== MAIN MENU ===================");
           System.out.println();
           System.out.println("\t  1.APPETIZERS");
           System.out.println("\t  2.TIFFINS ");
           System.out.println("\t  3.MAIN COURSE");
           System.out.println("\t  4.BEVERAGES");
           System.out.println("\t  5.DESSERTS");
           System.out.println("\t  0.EXIT AND PAY BILL");
           System.out.println();
           System.out.println("\t =================================================");
           System.out.println();
           System.out.println("\t ENTER YOUR CHOICE");           
           for(int i = 0; i < 5; i++)
            {
                ch = sc.nextInt();
                if(ch >= 0 && ch <=5)
                break;
                else
                System.out.println("INVALID CHOICE. PLEACE ENTER A VAILD CHOICE[1 TO 5].");
            }
           switch(ch) 
           {
               case 1 : appetizers();
               break;
               case 2 : tiffins();
               break;
               case 3 : maincourse();
               break;
               case 4 : beverages();
               break;
               case 5 : desserts();
               break;
               case 0 : bill();
               break;
               default: System.out.println("\t INVALID CHOICE");
           }
           for(int i = 0; i<c; i++)
           s = s + gt[i];
           if (d>0)
           {
               bill();
               break;             
           }
           System.out.println("\f");
           System.out.println();
           System.out.println("\t GRAND TOTAL = " + s);
           System.out.println();
           System.out.println("\t DO YOU WANT TO CONTINUE");
           System.out.println("\t ENTER YES TO GO TO MAIN MENU.");
           System.out.println("\t ENTER NO TO EXIT AND PAY THE BILL");
           for(int i = 0; i<=i; i++)
            {
                opt = sc.next();
                if(opt .equalsIgnoreCase("yes") || opt .equalsIgnoreCase("no"))
                break;
                else
                System.out.println("\t INVALID CHOICE. PLEASE ENTER A VALID CHOICE[YES/NO]");
            }
        }while(opt.equalsIgnoreCase("yes"));
        if(opt.equalsIgnoreCase("no"))
        bill();
    } 
    private void appetizers()
    {
        String n[] = {"TOMATO SOUP", "CORN SOUP  ", "MANCHURIAN" , "CORN FRITERS", "PANEER TIKKA", "CHICKEN WING","VEG NOODLES", "EGG NOODLES"};
        double cost[] = {40.00,40.00,60.00,80.00,120.00,130.00,50.00,60.00}; 
        double t = 0.00;       
        String opt = ""; 
        int ch = 0;
        int q = 0;
        do
        {
            System.out.println("\f");
            System.out.println(n.length);
            System.out.println("\t ===========================================");
            System.out.println();
            System.out.println("\t\tITEMS \t\t PRICE");
            for(int i = 0; i<n.length; i++)
            System.out.println("\t " +(i+1)+ "." + n[i] + "\t\t Rs." + cost[i]);
            System.out.println("\t 0.EXIT ");
            System.out.println();
            System.out.println("\t ===========================================");
            System.out.println("\t ENTER YOUR CHOICE ");            
            for(int i = 0; i<=i; i++)
            {
                ch = sc.nextInt();
                // if(ch >= 0 && ch <= n.length)
                // break;
                // else
                // System.out.println("\t INVALID CHOICE. PLEASE ENTER A VAILD CHOICE");

                if (!(ch >= 0) && !(ch <= n.length)) {
                    System.out.println(ch);
                }

                else {
                    break;
                }
                
            }
            if(ch == 0)
            {
                main();
                break;
            }
            System.out.println("\t ENTER QUANTITY");        
            for(int i = 0; i<=i; i++)
            {

                if(q>0)
                break;
                else
                System.out.println("\t INVALID CHOICE. PLEASE ENTER A VAILD CHOICE");
            }
            qty[c] = q;
            num = num + q;
            a[c] = n[ch-1];
            b[c] = cost[ch-1];
            t = t + (cost[ch-1] * q);
            gt[c] = (cost[ch-1] * q);
            c++;
            System.out.println("\f");
            System.out.println();
            System.out.println("\t  TOTAL FOR APPETIZERS = " + t);
            System.out.println();
            System.out.println("\t DO YOU WANT TO ORDER ANY MORE APPETIZERS."); 
            System.out.println("\t ENTER YES TO GO BACK TO APPETIZERS MENU");
            System.out.println("\t ENTER NO TO GO TO MAIN MENU");           
            for(int i = 0; i<=i; i++)
            {
                opt = sc.next();
                if(opt .equalsIgnoreCase("yes") || opt .equalsIgnoreCase("no"))
                break;
                else
                System.out.println("\t INVALID CHOICE. PLEASE ENTER A VALID CHOICE[YES/NO]");
            }
        }while(opt .equalsIgnoreCase("yes"));
    }
    private void tiffins()
    {
        String n[] = {"IDLI VADA", "SAMBAR IDLI", "MYSORE BAJJI", "PLAIN DOSA", "ONION DOSA", "PANEER DOSA", "MASALA DOSA", "RAVA DOSA", "BUTTER DOSA",  };
        double cost[] = {30.00, 40.00, 40.00, 50.00, 50.00, 80.00, 60.00, 40.00, 65.00}; 
        double t = 0.00;
        String opt = "";
        int ch = 0;
        int q = 0;
        do
        {
            System.out.println("\f");
            System.out.println("\t ===========================================");
            System.out.println();
            System.out.println("\t\tITEMS \t\t PRICE");
            for(int i = 0; i<n.length; i++)
            System.out.println("\t " +(i+1)+ "." + n[i] + "\t\t Rs." + cost[i]);
            System.out.println("\t 0.EXIT ");
            System.out.println();
            System.out.println("\t ===========================================");
            System.out.println("\t ENTER YOUR CHOICE ");            
            for(int i = 0; i<=i; i++)
            {
                ch = sc.nextInt();
                if(ch >= 0 && ch <=n.length)
                break;
                else
                System.out.println("\t INVALID CHOICE. PLEASE ENTER A VAILD CHOICE");
            }
            if(ch == 0)
            {
                main();
                break;
            }
            System.out.println("\t ENTER QUANTITY");        
            for(int i = 0; i<=i; i++)
            {
                q = sc.nextInt();
                if(q>0)
                break;
                else
                System.out.println("\t INVALID CHOICE. PLEASE ENTER A VAILD CHOICE");
            }
            qty[c] = q;
            a[c] = n[ch-1];
            num = num + q;
            b[c] = cost[ch-1];
            t = t + (cost[ch-1] * q);
            gt[c] = (cost[ch-1] * q);
            c++;
            System.out.println("\f");
            System.out.println();
            System.out.println("\t TOTAL FOR TIFFINS = " + t);
            System.out.println();
            System.out.println("\t DO YOU WANT TO ORDER ANY MORE TIFFINS."); 
            System.out.println("\t ENTER YES TO GO BACK TO TIFFINS MENU");
            System.out.println("\t ENTER NO TO GO TO MAIN MENU");            
            for(int i = 0; i<=i; i++)
            {
                opt = sc.next();
                if(opt .equalsIgnoreCase("yes") || opt .equalsIgnoreCase("no"))
                break;
                else
                System.out.println("\t INVALID CHOICE. PLEASE ENTER A VALID CHOICE[YES/NO]");
            }
        }while(opt .equalsIgnoreCase("yes"));         
    }
    private void maincourse()
    {
        String n[] = {"PLAIN NAAN", "BUTTER NAAN", "RUMALI ROTI", "SPICY CHICKEN", "MIXED VEG", "PANEER BUTTER", "KHADAI PANEER", "PALAK PANEER", "CHICKEN 65", "P00RI CHOLE", "DAL TADKA ", "VEG BIRYANI", "PLAIN RICE", "FRIED RICE", "JEERA RICE"};
        double cost[] = {20.00,25.00,20.00,170.00,85.00,130.00,120.00,125.00,150.00,50.00,100.00,60.00,80.00,30.00,60.00,50.00}; 
        double t = 0.00;
        String opt = "";   
        int ch = 0;
        int q = 0;
        do
        {
            System.out.println("\f");
            System.out.println("\t ===========================================");
            System.out.println();
            System.out.println("\t\tITEMS \t\t  PRICE");
            for(int i = 0; i<n.length; i++)
            System.out.println("\t" +(i+1)+ "." + n[i] + "\t\t Rs." + cost[i]);
            System.out.println("\t 0.EXIT ");
            System.out.println();
            System.out.println("\t ===========================================");
            System.out.println("\t ENTER YOUR CHOICE ");            
            for(int i = 0; i<=i; i++)
            {
                ch = sc.nextInt();
                if(ch >= 0 && ch <=n.length)
                break;
                else
                System.out.println("\t INVALID CHOICE. PLEASE ENTER A VAILD CHOICE");
            }
            if(ch == 0)
            {
                main();
                break;
            }
            System.out.println("\t ENTER QUANTITY");        
            for(int i = 0; i<=i; i++)
            {
                q = sc.nextInt();
                if(q>0)
                break;
                else
                System.out.println("\t INVALID CHOICE. PLEASE ENTER A VAILD CHOICE");
            }
            qty[c] = q;
            num = num + q;
            a[c] = n[ch-1];
            b[c] = cost[ch-1];
            t = t + (cost[ch-1] * q);
            gt[c] = (cost[ch-1] * q);
            c++;
            System.out.println("\f");
            System.out.println();
            System.out.println("\t  TOTAL FOR MAIN COURSE = " + t);
            System.out.println();
            System.out.println("\t DO YOU WANT TO ORDER ANY MORE ITEMS."); 
            System.out.println("\t ENTER YES TO GO BACK TO MAIN COURSE MENU");
            System.out.println("\t ENTER NO TO GO TO MAIN MENU");            
            for(int i = 0; i<=i; i++)
            {
                opt = sc.next();
                if(opt .equalsIgnoreCase("yes") || opt .equalsIgnoreCase("no"))
                break;
                else
                System.out.println("\t INVALID CHOICE. PLEASE ENTER A VALID CHOICE[YES/NO]");
            }            
        }while(opt .equalsIgnoreCase("yes"));         
    }
    private void beverages()
    {
        String n[] = {"TEA       ", "COLD COFFEE", "MIN. WATER", "COCA COLA" , "MILKSHAKE", "GRAPE JUICE", "ORANGE JUICE", "MANGO JUICE", "HOT CHOCO"};
        double cost[] = {30.00, 40.00, 25.00, 25.00, 50.00, 40.00, 40.00, 40.00, 80.00}; 
        double t = 0.00;
        String opt = ""; 
        int ch = 0;
        int q = 0;
        do
        {
            System.out.println("\f");
            System.out.println("\t ===========================================");
            System.out.println();
            System.out.println("\t\tITEMS \t\t PRICE");
            for(int i = 0; i<n.length; i++)
            System.out.println("\t " +(i+1)+ "." + n[i] + "\t\t Rs." + cost[i]);
            System.out.println("\t 0.EXIT ");
            System.out.println();
            System.out.println("\t ===========================================");
            System.out.println("\t ENTER YOUR CHOICE ");            
            for(int i = 0; i<=i; i++)
            {
                ch = sc.nextInt();
                if(ch >= 0 && ch <=n.length)
                break;
                else
                System.out.println("\t INVALID CHOICE. PLEASE ENTER A VAILD CHOICE");
            }
            if(ch == 0)
            {
                main();
                break;
            }
            System.out.println("\t ENTER QUANTITY");        
            for(int i = 0; i<=i; i++)
            {
                q = sc.nextInt();
                if(q>0)
                break;
                else
                System.out.println("\t INVALID CHOICE. PLEASE ENTER A VAILD CHOICE");
            }
            qty[c] = q;
            num = num + q;
            a[c] = n[ch-1];
            b[c] = cost[ch-1];
            t = t + (cost[ch-1] * q);
            gt[c] = (cost[ch-1] * q);
            c++;
            System.out.println("\f");
            System.out.println();
            System.out.println("\t   TOTAL FOR BEVERAGES = " + t);
            System.out.println();
            System.out.println("\t DO YOU WANT TO ORDER ANY MORE BEVERAGES."); 
            System.out.println("\t ENTER YES TO GO BACK TO BEVERAGES MENU");
            System.out.println("\t ENTER NO TO GO TO MAIN MENU");            
            for(int i = 0; i<=i; i++)
            {
                opt = sc.next();
                if(opt .equalsIgnoreCase("yes") || opt .equalsIgnoreCase("no"))
                break;
                else
                System.out.println("\t INVALID CHOICE. PLEASE ENTER A VALID CHOICE[YES/NO]");
            }
        }while(opt .equalsIgnoreCase("yes"));         
    }
    private void desserts()
    {
        String n[] = {"ICECREAM  ", "GULAB JAMUN",  "RASMALAI  ", "FRUIT SALAD ","CHOCO CAKE", "APPLE PIE" };
        double cost[] = {40.00, 40.00, 50.00, 40.00, 80.00, 65.00}; 
        double t = 0.00;
        String opt = "";    
        int ch = 0;
        int q = 0;
        do
        {
            System.out.println("\f");
            System.out.println("\t ===========================================");
            System.out.println();
            System.out.println("\t\tITEMS \t\t PRICE");
            for(int i = 0; i<n.length; i++)
            System.out.println("\t " +(i+1)+ "." + n[i] + "\t\t Rs." + cost[i]);
            System.out.println("\t 0.EXIT ");
            System.out.println();
            System.out.println("\t ===========================================");
            System.out.println("\t ENTER YOUR CHOICE ");            
            for(int i = 0; i<=i; i++)
            {
                ch = sc.nextInt();
                if(ch >= 0 && ch <=n.length)
                break;
                else
                System.out.println("\t INVALID CHOICE. PLEASE ENTER A VAILD CHOICE");
            }
            if(ch == 0)
            {
                main();
                break;
            }
            System.out.println("\t ENTER QUANTITY");        
            for(int i = 0; i<=i; i++)
            {
                q = sc.nextInt();
                if(q>0)
                break;
                else
                System.out.println("\t INVALID CHOICE. PLEASE ENTER A VAILD CHOICE");
            }
            qty[c] = q;
            num = num + q;
            a[c] = n[ch-1];
            b[c] = cost[ch-1];
            t = t + (cost[ch-1] * q);
            gt[c] = (cost[ch-1] * q);
            c++;
            System.out.println("\f");
            System.out.println();
            System.out.println("\t   TOTAL FOR DESSERTS  = " + t);
            System.out.println();
            System.out.println("\t DO YOU WANT TO ORDER ANY MORE DESSERTS."); 
            System.out.println("\t ENTER YES TO GO BACK TO DESSERTS MENU");
            System.out.println("\t ENTER NO TO GO TO MAIN MENU");
            for(int i = 0; i<=i; i++)
            {
                opt = sc.next();
                if(opt .equalsIgnoreCase("yes") || opt .equalsIgnoreCase("no"))
                break;
                else
                System.out.println("\t INVALID CHOICE. PLEASE ENTER A VALID CHOICE[YES/NO]");
            }
        }while(opt .equalsIgnoreCase("yes"));         
    }
    private void bill()
    {
        String opt = "";String opt1 = "";
        int ch; 
        int n = 0;         
        double sum2 = 0.00;
        if(c==0)
        {
            System.out.println("\f");
            System.out.println();
            System.out.println();
            System.out.println("\t  YOU HAVE NOT PURCHASED ANY ITEMS");
            System.out.println();
            System.out.println();            
            System.out.println("\t     THANK YOU AND VISIT AGAIN"); 
        }
        else
        {            
            if(d<=0)
            {
                do
                {
                double sum1 = 0.00;
                for(int i = 0; i<c; i++)
                sum1 = sum1 + gt[i];
                System.out.println("\f");
                System.out.println("\t  S.NO    ITEMS ORDERED \t  PRICE \tQUANTITY \t TOTAL COST");
                for(int i = 0; i<c; i++)
                System.out.println("\t  "+(i+1) + ".\t " + a[i] + "\t\tRs." + b[i] + "\t\t" + qty[i] + "\t\t Rs. " + (b[i] * qty[i]));
                System.out.println();
                System.out.println("\t TOTAL NUMBER OF ITEMS ORDERED = " + num);
                System.out.println();                
                System.out.println();
                System.out.println("\t GRAND TOTAL = " + sum1);
                System.out.println();
                if(d<1)
                {
                System.out.println("\t DO YOU WANT TO DELETE ANY ITEM. PRESS YES OR NO TO CONTINUE. ");
                for(int i = 0; i<=i; i++)
                {
                    opt = sc.next();
                    if(opt.equalsIgnoreCase("yes") || opt.equalsIgnoreCase("no"))
                    break;
                    else
                    System.out.println("\t INVALID CHOICE. PLEASE ENTER A VALID CHOICE[YES/NO]");
                }
                }
                d++;
                if (opt.equalsIgnoreCase("yes") || opt1.equalsIgnoreCase("yes"))
                {
                    System.out.println("\t ENTER THE S.NO OF THE ITEM YOU WANT TO DELETE.");
                    for (int i = 0; i <= i; i++)
                    {
                        ch = sc.nextInt();
                        n = ch - 1;
                        if(n < c)
                        {                       
                            num = num - qty[n];
                            break;
                        }
                        else
                        System.out.println("\t INVALID S.NO. ENTER AGAIN.");
                    }
                    delete(n);                    
                }
                if(opt.equalsIgnoreCase("no"))
                break;
                System.out.println("\t DO YOU WANT TO DELETE ANY MORE ITEMS. PRESS YES OR NO TO CONTINUE. ");
                for(int i = 0; i<=i; i++)
                {
                    opt1 = sc.next();
                    if(opt1.equalsIgnoreCase("yes") || opt1.equalsIgnoreCase("no"))
                    break;
                    else
                    System.out.println("\t INVALID CHOICE. PLEASE ENTER A VALID CHOICE[YES/NO]");
                }
            }while(opt1.equalsIgnoreCase("yes"));
            }
            for(int i = 0; i<c; i++)
            sum2 = sum2 + gt[i];
            System.out.println("\f");
            System.out.println();
            System.out.println("\t ~~~~~~~~~~~~~~~~~~~~~~  THE TASTES OF INDIA ~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println("\t ==================================================================");
            System.out.println();
            System.out.println("\t  S.NO    ITEMS ORDERED \t  PRICE \tQUANTITY \t TOTAL COST");
            for(int i = 0; i<c; i++)
            System.out.println("\t  "+(i+1) + ".\t " + a[i] + "\t\tRs." + b[i] + "\t\t" + qty[i] + "\t\t Rs. " + (b[i] * qty[i]));
            System.out.println();
            System.out.println("\t TOTAL NUMBER OF ITEMS ORDERED = " + num);
            System.out.println();
            System.out.println();
            System.out.println("\t GRAND TOTAL = " + sum2);
            System.out.println();
            System.out.println();
            System.out.println("\t ==================================================================");
            System.out.println();
            System.out.println("\t\t\t THANK YOU FOR VISITING");
        }
    }
    private void delete(int k)
    {        
        for (int i = k; i<(c-1); i++)
        {
            a[i] = a[i+1];  
            b[i] = b[i+1];
            qty[i] = qty[i+1];
            gt[i] = gt[i+1];
        }
        c--;        
    }
}
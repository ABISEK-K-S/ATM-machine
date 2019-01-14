//import java.io.*;
import java.util.*;
    
      
class proceed 
{  
  option b=new option();
  int opt;
  void process()

    {    
      Scanner p = new Scanner(System.in);
      System.out.println("\n\nThanks for confirming your pin\n\n");
      System.out.println("Choose any action from below---\n");
      System.out.println("1.CHECK BALANCE\t\t2.WITHDRAW\n\n3.CHANGE PIN\t\t4.MONEY TRANSFER\n\n");
       opt=p.nextInt(); 
        b.option(opt);
    }

  }

class pin extends proceed
{  
      int pin,balance=0;;
      int[] a= new int[8000];
      void generate()
      {
       for(int i=1000;i<9999;i++)
          {
        a[i]=i;
       if(a[i]==pin) {process();}    


     //System.out.println(a[i]);
          }
        
      }
}

class user extends pin 
{
user() 
   {  int temp;
      Date x=new Date();
      Scanner p = new Scanner(System.in);
      System.out.println("\t\t<<--Welcome to our Bank-->>\n");
      System.out.println("\tThe current IST is-->  "+x+"\n");
      System.out.println("Waiting for the pin");
      pin= p.nextInt();
      temp=pin/1000;
      if((temp<10)&&(temp>=1)){
    //  System.out.println(pin);
     process();}
  }
}

class Main {
  public static void main(String[] args)
   {
    user u=new user();
   }
           }


class option extends database
{
  void option(int opt)
  {
    switch(opt)
    {
      case 1:System.out.println("\n\n\nTHE AVAILABLE BALANCE--> "+balance+"\n\n\n");
      case 2:withdraw();
    }
  }

}           

 class database
{
   int balance=50000;
   


   void withdraw()
   {
     Scanner pa= new Scanner(System.in); 
     System.out.println("Enter the amount : ");
     int amount=pa.nextInt();
     
     if(amount>balance)
     {
       System.out.println("Insufficient balance\n\n");
     }


     if(amount==balance)
     {
       System.out.println("You have to maintain the minimum balance amount as per our policy i.e  5000\n\n");
     }


   if(amount<balance)
   {   balance =balance-amount;
     System.out.println("\nPlease collect your cash  :)  \n");
     System.out.println("Remaining balance is  "+balance);
   }
}

}

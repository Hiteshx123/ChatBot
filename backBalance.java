import java.util.*;
import java.util.Scanner;
class backBalance
{  
  public static void main(String[]args)
  { 
    HashMap hm = new HashMap();
    hm.put("Hitesh", new Double(1000));
    hm.put("Rohan" , new Double(2000));
    hm.put("Rohit", new Double(3434.34));
    hm.put("Mohit", new Double(123.22));
    hm.put("Ashish", new Double(1200.34));
    hm.put("Khariwal", new Double(99.34));
    hm.put("Pankaj", new Double(-19.34));
    Set set = hm.entrySet();
    
    Scanner in = new Scanner(System.in);
    String statement = in.nextLine();
    double statement2 = in.nextDouble();
    while (!statement.equalsIgnoreCase("exit"))
    {
      double savedbalance = statement2;
      double balance = 0;
      System.out.print("\nEnter your name: ");
      statement = in.nextLine();
     
      if (statement.equalsIgnoreCase("Hitesh"))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals("hitech"))
        {
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("What would you like to Withdraw or Deposit");
        statement = in.nextLine();
        if (statement.equalsIgnoreCase("Withdraw"))
        {  
          System.out.print("How huch would you like to Withdraw: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Hitesh")).doubleValue();
          hm.put("Hitesh", new Double(balance - statement2));
          System.out.print("This is your final balance: " + hm.get("Hitesh"));
          System.out.print("\nPlease enter Confirm if you are Happy with Your transaction");
          statement = in.nextLine();
          if (statement.equalsIgnoreCase("Confirm"))
          {
               statement = ("exit");
          }
          else
          {
               hm.put("Hitesh", new Double(balance + savedbalance));
               statement = ("exit");
          }
        }

        if (statement.equalsIgnoreCase("Deposit"))
        {
          System.out.print("How huch would you like to Deposit: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Hitesh")).doubleValue();
          hm.put("Hitesh", new Double(balance + statement2));
          System.out.print("This is your final balance: " + hm.get("Hitesh"));
          System.out.print("\nPlease enter Confirm if you are Happy with Your transaction");
          statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
               statement = ("exit");
          }
          else
          {
               hm.put("Hitesh", new Double(balance - savedbalance));
               statement = ("exit");
          }
        }
         
         
           
        
      else if (statement.equalsIgnoreCase("Rohan"))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals("hitech"))
        {
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("What would you like to do\n Withdraw or Deposit");
        if (statement.equalsIgnoreCase("Withdraw"))
        {  
          System.out.print("How huch would you like to Withdraw: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Rohan")).doubleValue();
          hm.put("Rohan", new Double(balance - statement2));
           System.out.print("This is your final balance: " + hm.get("Rohan"));
          System.out.print("\nPlease enter Confirm if you are Happy with Your transaction");
          statement = in.nextLine();
          if (statement.equalsIgnoreCase("Confirm"))
          {
               statement = ("exit");
          }
          else
          {
               hm.put("Rohan", new Double(balance + savedbalance));
               statement = ("exit");
          }
        }

        if (statement.equalsIgnoreCase("Deposit"))
        {
           System.out.print("How huch would you like to Deposit: ");
          statement = in.nextLine();
          balance = ((Double)hm.get("Rohan")).doubleValue();
          hm.put("Rohan", new Double(balance + statement));
          System.out.print("This is your final balance: " + hm.get("Rohan"));
          System.out.print("\nPlease enter Confirm if you are Happy with Your transaction");
          statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
               statement = ("exit");
          }
          else
          {
               hm.put("Rohan", new Double(balance - savedbalance));
               statement = ("exit");
          }
      }
      else if (statement.equalsIgnoreCase("Rohit"))
      {
      }
      else if (statement.equalsIgnoreCase("Mohit"))
      {
      }
      else if (statement.equalsIgnoreCase("Ashish"))
      {
      }
      else if (statement.equalsIgnoreCase("Khariwal"))
      {
      }
      else if (statement.equalsIgnoreCase("Pankaj"))
      {
      }
    } 
  }
} 
}
}
  
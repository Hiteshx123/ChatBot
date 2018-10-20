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
    String statement = ("A");
    double statement2 = 1;
    
    while (!statement.equalsIgnoreCase("specialexit"))
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
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        if (statement.equalsIgnoreCase("Withdraw"))
        {  
          System.out.print("How huch would you like to Withdraw: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Hitesh")).doubleValue();
          hm.put("Hitesh", new Double(balance - statement2));
          System.out.print("This is your final balance: " + hm.get("Hitesh") + " \nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
          if (statement.equalsIgnoreCase("Confirm"))
          {
               System.out.print("Thank you");
          }
          else
          {
               hm.put("Hitesh", new Double(balance + savedbalance));
               System.out.print("Thank you");
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
          in.nextLine();
          statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
               hm.put("Hitesh", new Double(balance - savedbalance));
                 System.out.print("\nThank you");
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get("Hitesh"));
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
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        if (statement.equalsIgnoreCase("Withdraw"))
        {  
          System.out.print("How huch would you like to Withdraw: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Rohan")).doubleValue();
          hm.put("Rohan", new Double(balance - statement2));
          System.out.print("This is your final balance: " + hm.get("Rohan") + " \nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
          if (statement.equalsIgnoreCase("Confirm"))
          {
               System.out.print("Thank you");
          }
          else
          {
               hm.put("Rohan", new Double(balance + savedbalance));
               System.out.print("Thank you");
          }
        }

        if (statement.equalsIgnoreCase("Deposit"))
        {
          System.out.print("How huch would you like to Deposit: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Rohan")).doubleValue();
          hm.put("Rohan", new Double(balance + statement2));
          System.out.print("This is your final balance: " + hm.get("Rohan"));
          System.out.print("\nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
               hm.put("Rohan", new Double(balance - savedbalance));
                 System.out.print("\nThank you");
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get("Rohan"));
          }    
        
      }
      else if (statement.equalsIgnoreCase("Rohit"))
      {
          System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals("hitech"))
        {
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        if (statement.equalsIgnoreCase("Withdraw"))
        {  
          System.out.print("How huch would you like to Withdraw: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Rohit")).doubleValue();
          hm.put("Rohit", new Double(balance - statement2));
          System.out.print("This is your final balance: " + hm.get("Rohit") + " \nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
          if (statement.equalsIgnoreCase("Confirm"))
          {
               System.out.print("Thank you");
          }
          else
          {
               hm.put("Rohit", new Double(balance + savedbalance));
               System.out.print("Thank you");
          }
        }

        if (statement.equalsIgnoreCase("Deposit"))
        {
          System.out.print("How huch would you like to Deposit: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Rohit")).doubleValue();
          hm.put("Rohit", new Double(balance + statement2));
          System.out.print("This is your final balance: " + hm.get("Rohit"));
          System.out.print("\nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
               hm.put("Rohit", new Double(balance - savedbalance));
                 System.out.print("\nThank you");
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get("Rohit"));
          }    
        
      }
      else if (statement.equalsIgnoreCase("Mohit"))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals("hitech"))
        {
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        if (statement.equalsIgnoreCase("Withdraw"))
        {  
          System.out.print("How huch would you like to Withdraw: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Mohit")).doubleValue();
          hm.put("Mohit", new Double(balance - statement2));
          System.out.print("This is your final balance: " + hm.get("Mohit") + " \nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
          if (statement.equalsIgnoreCase("Confirm"))
          {
               System.out.print("Thank you");
          }
          else
          {
               hm.put("Mohit", new Double(balance + savedbalance));
               System.out.print("Thank you");
          }
        }

        if (statement.equalsIgnoreCase("Deposit"))
        {
          System.out.print("How huch would you like to Deposit: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Mohit")).doubleValue();
          hm.put("Mohit", new Double(balance + statement2));
          System.out.print("This is your final balance: " + hm.get("Mohit"));
          System.out.print("\nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
               hm.put("Mohit", new Double(balance - savedbalance));
                 System.out.print("\nThank you");
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get("Mohit"));
          }    
        


      }
      else if (statement.equalsIgnoreCase("Ashish"))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals("hitech"))
        {
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        if (statement.equalsIgnoreCase("Withdraw"))
        {  
          System.out.print("How huch would you like to Withdraw: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Ashish")).doubleValue();
          hm.put("Ashish", new Double(balance - statement2));
          System.out.print("This is your final balance: " + hm.get("Ashish") + " \nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
          if (statement.equalsIgnoreCase("Confirm"))
          {
               System.out.print("Thank you");
          }
          else
          {
               hm.put("Ashish", new Double(balance + savedbalance));
               System.out.print("Thank you");
          }
        }

        if (statement.equalsIgnoreCase("Deposit"))
        {
          System.out.print("How huch would you like to Deposit: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Ashish")).doubleValue();
          hm.put("Ashish", new Double(balance + statement2));
          System.out.print("This is your final balance: " + hm.get("Ashish"));
          System.out.print("\nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
               hm.put("Ashish", new Double(balance - savedbalance));
                 System.out.print("\nThank you");
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get("Ashish"));
          }    
        


      }
      else if (statement.equalsIgnoreCase("Khariwal"))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals("hitech"))
        {
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        if (statement.equalsIgnoreCase("Withdraw"))
        {  
          System.out.print("How huch would you like to Withdraw: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Khariwal")).doubleValue();
          hm.put("Khariwal", new Double(balance - statement2));
          System.out.print("This is your final balance: " + hm.get("Khariwal") + " \nPlease enter Confirm if you are Happy with Your transaction");
          
          statement = in.nextLine();
          if (statement.equalsIgnoreCase("Confirm"))
          {
               System.out.print("Thank you");
          }
          else
          {
               hm.put("Khariwal", new Double(balance + savedbalance));
               System.out.print("Thank you");
          }
        }

        if (statement.equalsIgnoreCase("Deposit"))
        {
          System.out.print("How huch would you like to Deposit: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Khariwal")).doubleValue();
          hm.put("Khariwal", new Double(balance + statement2));
          System.out.print("This is your final balance: " + hm.get("Khariwal"));
          System.out.print("\nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
               hm.put("Khariwal", new Double(balance - savedbalance));
                 System.out.print("\nThank you");
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get("Khariwal"));
          }    
        


      }
      else if (statement.equalsIgnoreCase("Pankaj"))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals("hitech"))
        {
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        if (statement.equalsIgnoreCase("Withdraw"))
        {  
          System.out.print("How huch would you like to Withdraw: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Pankaj")).doubleValue();
          hm.put("Pankaj", new Double(balance - statement2));
          System.out.print("This is your final balance: " + hm.get("Pankaj") + " \nPlease enter Confirm if you are Happy with Your transaction");
          
          statement = in.nextLine();
          if (statement.equalsIgnoreCase("Confirm"))
          {
               System.out.print("Thank you");
          }
          else
          {
               hm.put("Pankaj", new Double(balance + savedbalance));
               System.out.print("Thank you");
          }
        }

        if (statement.equalsIgnoreCase("Deposit"))
        {
          System.out.print("How huch would you like to Deposit: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Pankaj")).doubleValue();
          hm.put("Pankaj", new Double(balance + statement2));
          System.out.print("This is your final balance: " + hm.get("Pankaj"));
          System.out.print("\nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
               hm.put("Pankaj", new Double(balance - savedbalance));
                 System.out.print("\nThank you");
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get("Pankaj"));
          }    
        


      }
    } 
  }
}




  
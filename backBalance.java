//only need to add pin error system to new users (does function)
//please check spelling errors
//the program must be later tested with a different compiler (Textpad)
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
    String name1 = ("Unknown");
    String name2 = ("Unknown2");
    String name3 = ("Unknown3");
    String name4 = ("Unknown34");
    String name5 = ("Unknown37");
    String name1pin = ("Unknown4");
    String name2pin = ("Unknown5");
    String name3pin = ("UNknown6");
    String name4pin = ("Unknownx");
    String name5pin = ("Unknownx");
    String Hiteshpin = ("hitech");
    String Rohanpin = ("hitech");
    String Rohitpin = ("hitech");
    String Mohitpin = ("hitech");
    String Ashishpin = ("hitech");
    String Khariwalpin = ("hitech");
    String Pankajpin = ("hitech");
    int numerator = 0;
    String statement1 = ("");
    String statement3 = ("");
    String cardnum1 = ("");
    String cardnum2 = ("");
    String cardnum3 = ("");
    String cardnum4 = ("");
    String cardnum5 = ("");
    String cardnum6 = ("");
    String cardnum7 = ("");
    String cardnum8 = ("");
    String cardnum9 = ("");
    String cardnum10 = ("");
    String cardpin1 = ("");
    String cardpin10 = ("");
    String cardpin2 = ("");
    String cardpin3 = ("");
    String cardpin4 = ("");
    String cardpin5 = ("");
    String cardpin6 = ("");
    String cardpin7 = ("");
    String cardpin8 = ("");
    String cardpin9 = ("");
    double num10 =0;
    double num11 = 0;
    double num12 = 0;
    double num13 = 0;
    double num14 = 0;
    double num15 = 0;
    double num16 = 0;
    double num17 = 0;
    double num18 = 0;
    double num19 = 0;
    double num20 = 0;
    while (!statement.equalsIgnoreCase("specialexit"))
    {
      double savedbalance = statement2;
      double balance = 0;
      System.out.print("\nEnter your name: ");
      statement1  = in.nextLine();
      statement = statement1;
      if (!statement1.equalsIgnoreCase(name1) && !statement1.equalsIgnoreCase(name2) && !statement1.equalsIgnoreCase(name3) && !statement1.equalsIgnoreCase("Hitesh") && !statement1.equalsIgnoreCase("Rohan") && !statement1.equalsIgnoreCase("Rohit") && !statement1.equalsIgnoreCase("Mohit") && !statement1.equalsIgnoreCase("Ashish") && !statement1.equalsIgnoreCase("Karival") && !statement1.equalsIgnoreCase("Pankaj") && !statement1.equalsIgnoreCase("Empacess") && !statement1.equalsIgnoreCase("EmpAcess"))   
        {
          numerator = numerator + 1;
          System.out.print("This person currently does not exist in this system\nPlease try again ");
          statement = in.nextLine();
          statement1 = statement;
          if (numerator == 3)
          {
            System.out.print("The account your looking for may not exist. Please contact an employee for assistance");
            System.out.print("\nPlease enter COnfirm to continue");
            statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you\n");
                 statement3 = ("EmpExit");
                 numerator = 0;
          }
          else
          {
               
                 System.out.print("Thank you\n");
                 numerator = 0;
                 statement3 = ("EmpExit");
               
          }
           System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
          }
      }
      if (statement.equalsIgnoreCase("Hitesh"))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals(Hiteshpin) && !statement.equals("pinexit"))
        {
          numerator = numerator + 1;
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
          if (numerator == 3)
          {
            System.out.print("Would you like to change your pin. Please contact an employee for assistance");
            System.out.print("\nPlease enter COnfirm to continue");
            statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you\n");
                 numerator = 0;
                 statement = ("pinexit");
          }
          else
          {
               
                 System.out.print("Thank you\n");
                 numerator = 0;
                 statement = ("pinexit");
          }
          
        }
        }
        if (statement.equals(Hiteshpin))
        {
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        while (!statement.equalsIgnoreCase("Withdraw") && !statement.equalsIgnoreCase("Deposit") && !statement.equalsIgnoreCase("Check Balance"))
        {
          System.out.print("Please try again \n What would you like to Withdraw or Deposit or Check Balance");
          statement = in.nextLine();
        } 
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
               System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
               statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }  
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
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get("Hitesh") + "\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
          }     
          
         
      }
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      }
      
         
           
        
      else if (statement.equalsIgnoreCase("Rohan"))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals(Rohanpin) && !statement.equals("pinexit"))
        {
          numerator = numerator + 1;
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
          if (numerator == 3)
          {
            System.out.print("Would you like to change your pin. Please contact an employee for assistance");
            System.out.print("\nPlease enter COnfirm to continue");
            statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you\n");
                 numerator = 0;
                 statement = ("pinexit");
          }
          else
          {
               
                 System.out.print("Thank you\n");
                 numerator = 0;
                 statement = ("pinexit");
          }
          
        }
        }
        if (statement.equals(Rohanpin))
        {
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        while (!statement.equalsIgnoreCase("Withdraw") && !statement.equalsIgnoreCase("Deposit") && !statement.equalsIgnoreCase("Check Balance"))
        {
          System.out.print("Please try again \n What would you like to Withdraw or Deposit or Check Balance");
          statement = in.nextLine();
        } 
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
               System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
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
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get("Rohan") + "\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
          }    
          
        
      }
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      }
      else if (statement.equalsIgnoreCase("Rohit"))
      {
          System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals(Rohitpin) && !statement.equals("pinexit"))
        {
          numerator = numerator + 1;
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
          if (numerator == 3)
          {
            System.out.print("Would you like to change your pin. Please contact an employee for assistance");
            System.out.print("\nPlease enter COnfirm to continue");
            statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you\n");
                 numerator = 0;
                 statement = ("pinexit");
          }
          else
          {
               
                 System.out.print("Thank you\n");
                 numerator = 0;
                 statement = ("pinexit");
          }
          
        }
        }
        if (statement.equals(Rohitpin))
        {
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        while (!statement.equalsIgnoreCase("Withdraw") && !statement.equalsIgnoreCase("Deposit") && !statement.equalsIgnoreCase("Check Balance"))
        {
          System.out.print("Please try again \n What would you like to Withdraw or Deposit or Check Balance");
          statement = in.nextLine();
        } 
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
               System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
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
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }
         if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get("Rohit") + "\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
          }  
        }
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      }
      else if (statement.equalsIgnoreCase("Mohit"))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals(Mohitpin) && !statement.equals("pinexit"))
        {
          numerator = numerator + 1;
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
          if (numerator == 3)
          {
            System.out.print("Would you like to change your pin. Please contact an employee for assistance");
            System.out.print("\nPlease enter COnfirm to continue");
            statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you\n");
                 numerator = 0;
                 statement = ("pinexit");
          }
          else
          {
               
                 System.out.print("Thank you\n");
                 numerator = 0;
                 statement = ("pinexit");
          }
          
        }
        }
        if (statement.equals(Mohitpin))
        {
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        while (!statement.equalsIgnoreCase("Withdraw") && !statement.equalsIgnoreCase("Deposit") && !statement.equalsIgnoreCase("Check Balance"))
        {
          System.out.print("Please try again \n What would you like to Withdraw or Deposit or Check Balance");
          statement = in.nextLine();
        } 
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
               System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
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
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get("Mohit") + "\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
          } 
        }
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");


      }
      else if (statement.equalsIgnoreCase("Ashish"))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals(Ashishpin) && !statement.equals("pinexit"))
        {
          numerator = numerator + 1;
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
          if (numerator == 3)
          {
            System.out.print("Would you like to change your pin. Please contact an employee for assistance");
            System.out.print("\nPlease enter COnfirm to continue");
            statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you\n");
                 numerator = 0;
                 statement = ("pinexit");
          }
          else
          {
               
                 System.out.print("Thank you\n");
                 numerator = 0;
                 statement = ("pinexit");
          }
          
        }
        }
        if (statement.equals(Ashishpin))
        {
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        while (!statement.equalsIgnoreCase("Withdraw") && !statement.equalsIgnoreCase("Deposit") && !statement.equalsIgnoreCase("Check Balance"))
        {
          System.out.print("Please try again \n What would you like to Withdraw or Deposit or Check Balance");
          statement = in.nextLine();
        } 
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
               System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
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
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get("Ashish") + "\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
          }
        }
          System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        


      }
      else if (statement.equalsIgnoreCase("Khariwal"))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals(Khariwalpin) && !statement.equals("pinexit"))
        {
          numerator = numerator + 1;
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
          if (numerator == 3)
          {
            System.out.print("Would you like to change your pin. Please contact an employee for assistance");
            System.out.print("\nPlease enter COnfirm to continue");
            statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you\n");
                 numerator = 0;
                 statement = ("pinexit");
          }
          else
          {
               
                 System.out.print("Thank you\n");
                 numerator = 0;
                 statement = ("pinexit");
          }
          
        }
        }
        if (statement.equals(Khariwalpin))
        {
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        while (!statement.equalsIgnoreCase("Withdraw") && !statement.equalsIgnoreCase("Deposit") && !statement.equalsIgnoreCase("Check Balance"))
        {
          System.out.print("Please try again \n What would you like to Withdraw or Deposit or Check Balance");
          statement = in.nextLine();
        } 
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
               System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
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
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get("Khariwal") + "\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
          }    
        }
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");


      }
      else if (statement.equalsIgnoreCase("Pankaj"))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals(Pankajpin) && !statement.equals("pinexit"))
        {
          numerator = numerator + 1;
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
          if (numerator == 3)
          {
            System.out.print("Would you like to change your pin. Please contact an employee for assistance");
            System.out.print("\nPlease enter COnfirm to continue");
            statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you\n");
                 numerator = 0;
                 statement = ("pinexit");
          }
          else
          {
               
                 System.out.print("Thank you\n");
                 numerator = 0;
                 statement = ("pinexit");
          }
          
        }
        }
        if (statement.equals(Pankajpin))
        {
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        while (!statement.equalsIgnoreCase("Withdraw") && !statement.equalsIgnoreCase("Deposit") && !statement.equalsIgnoreCase("Check Balance"))
        {
          System.out.print("Please try again \n What would you like to Withdraw or Deposit or Check Balance");
          statement = in.nextLine();
        } 
        if (statement.equalsIgnoreCase("Withdraw"))
        {  
          System.out.print("How huch would you like to Withdraw: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get("Pankaj")).doubleValue();
          hm.put("Pankaj", new Double(balance - statement2));
          System.out.print("This is your final balance: " + hm.get("Pankaj") + " \nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
          if (statement.equalsIgnoreCase("Confirm"))
          {
               System.out.print("Thank you");
          }
          else
          {
               hm.put("Pankaj", new Double(balance + savedbalance));
               System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
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
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get("Pankaj") + "\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
          }    
        }
        
System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

      }
      if (statement.equalsIgnoreCase(name1))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals(name1pin))
        {
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        while (!statement.equalsIgnoreCase("Withdraw") && !statement.equalsIgnoreCase("Deposit") && !statement.equalsIgnoreCase("Check Balance"))
        {
          System.out.print("Please try again \n What would you like to Withdraw or Deposit or Check Balance");
          statement = in.nextLine();
        } 
        if (statement.equalsIgnoreCase("Withdraw"))
        {  
          System.out.print("How huch would you like to Withdraw: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get(name1)).doubleValue();
          hm.put( name1, new Double(balance - statement2));
          System.out.print("This is your final balance: " + hm.get(name1) + " \nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
          if (statement.equalsIgnoreCase("Confirm"))
          {
               System.out.print("Thank you");
          }
          else
          {
               hm.put( name1, new Double(balance + savedbalance));
               System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }

        if (statement.equalsIgnoreCase("Deposit"))
        {
          System.out.print("How huch would you like to Deposit: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get(name1)).doubleValue();
          hm.put( name1, new Double(balance + statement2));
          System.out.print("This is your final balance: " + hm.get(name1));
          System.out.print("\nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
               hm.put(name1, new Double(balance - savedbalance));
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get(name1) + "\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
          }     
        
System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

      }
      if (statement.equalsIgnoreCase(name2))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals(name2pin))
        {
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        while (!statement.equalsIgnoreCase("Withdraw") && !statement.equalsIgnoreCase("Deposit") && !statement.equalsIgnoreCase("Check Balance"))
        {
          System.out.print("Please try again \n What would you like to Withdraw or Deposit or Check Balance");
          statement = in.nextLine();
        } 
        if (statement.equalsIgnoreCase("Withdraw"))
        {  
          System.out.print("How huch would you like to Withdraw: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get(name2)).doubleValue();
          hm.put( name2, new Double(balance - statement2));
          System.out.print("This is your final balance: " + hm.get(name2) + " \nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
          if (statement.equalsIgnoreCase("Confirm"))
          {
               System.out.print("Thank you");
          }
          else
          {
               hm.put( name2, new Double(balance + savedbalance));
               System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }

        if (statement.equalsIgnoreCase("Deposit"))
        {
          System.out.print("How huch would you like to Deposit: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get(name2)).doubleValue();
          hm.put( name2, new Double(balance + statement2));
          System.out.print("This is your final balance: " + hm.get(name2));
          System.out.print("\nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
               hm.put(name1, new Double(balance - savedbalance));
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get(name2) + "\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
          }     
        
System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

      }
      if (statement.equalsIgnoreCase(name3))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals(name3pin))
        {
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        while (!statement.equalsIgnoreCase("Withdraw") && !statement.equalsIgnoreCase("Deposit") && !statement.equalsIgnoreCase("Check Balance"))
        {
          System.out.print("Please try again \n What would you like to Withdraw or Deposit or Check Balance");
          statement = in.nextLine();
        } 
        if (statement.equalsIgnoreCase("Withdraw"))
        {  
          System.out.print("How huch would you like to Withdraw: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get(name3)).doubleValue();
          hm.put( name3, new Double(balance - statement2));
          System.out.print("This is your final balance: " + hm.get(name3) + " \nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
          if (statement.equalsIgnoreCase("Confirm"))
          {
               System.out.print("Thank you");
          }
          else
          {
               hm.put( name1, new Double(balance + savedbalance));
               System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }

        if (statement.equalsIgnoreCase("Deposit"))
        {
          System.out.print("How huch would you like to Deposit: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get(name3)).doubleValue();
          hm.put( name3, new Double(balance + statement2));
          System.out.print("This is your final balance: " + hm.get(name3));
          System.out.print("\nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
               hm.put(name1, new Double(balance - savedbalance));
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get(name3) + "\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
          }     
        
System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

      }
      if (statement.equalsIgnoreCase(name4))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals(name4pin))
        {
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        while (!statement.equalsIgnoreCase("Withdraw") && !statement.equalsIgnoreCase("Deposit") && !statement.equalsIgnoreCase("Check Balance"))
        {
          System.out.print("Please try again \n What would you like to Withdraw or Deposit or Check Balance");
          statement = in.nextLine();
        } 
        if (statement.equalsIgnoreCase("Withdraw"))
        {  
          System.out.print("How huch would you like to Withdraw: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get(name4)).doubleValue();
          hm.put( name4, new Double(balance - statement2));
          System.out.print("This is your final balance: " + hm.get(name4) + " \nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
          if (statement.equalsIgnoreCase("Confirm"))
          {
               System.out.print("Thank you");
          }
          else
          {
               hm.put(name4, new Double(balance + savedbalance));
               System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }

        if (statement.equalsIgnoreCase("Deposit"))
        {
          System.out.print("How huch would you like to Deposit: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get(name4)).doubleValue();
          hm.put(name4, new Double(balance + statement2));
          System.out.print("This is your final balance: " + hm.get(name4));
          System.out.print("\nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
               hm.put( name4, new Double(balance - savedbalance));
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get(name4) + "\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
          }     
        
System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

      }
      if (statement.equalsIgnoreCase(name5))
      {
        System.out.print("\nPlease input your pin: ");
        statement = in.nextLine();
        while (!statement.equals(name5pin))
        {
          System.out.print("\nIncorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("What would you like to Withdraw or Deposit or Check Balance");
        statement = in.nextLine();
        while (!statement.equalsIgnoreCase("Withdraw") && !statement.equalsIgnoreCase("Deposit") && !statement.equalsIgnoreCase("Check Balance"))
        {
          System.out.print("Please try again \n What would you like to Withdraw or Deposit or Check Balance");
          statement = in.nextLine();
        } 
        if (statement.equalsIgnoreCase("Withdraw"))
        {  
          System.out.print("How huch would you like to Withdraw: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get(name5)).doubleValue();
          hm.put( name5, new Double(balance - statement2));
          System.out.print("This is your final balance: " + hm.get(name5) + " \nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
          if (statement.equalsIgnoreCase("Confirm"))
          {
               System.out.print("Thank you");
          }
          else
          {
               hm.put(name5, new Double(balance + savedbalance));
               System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }

        if (statement.equalsIgnoreCase("Deposit"))
        {
          System.out.print("How huch would you like to Deposit: ");
          statement2 = in.nextDouble();
          balance = ((Double)hm.get(name5)).doubleValue();
          hm.put(name5, new Double(balance + statement2));
          System.out.print("This is your final balance: " + hm.get(name5));
          System.out.print("\nPlease enter Confirm if you are Happy with Your transaction");
          in.nextLine();
          statement = in.nextLine();
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
               hm.put( name5, new Double(balance - savedbalance));
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
        }
          if (statement.equalsIgnoreCase("Check Balance"))
          {
            System.out.print("Your current balance is " + hm.get(name5) + "\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("Thank you \n Is there an Issue, Please phone 732 438 0425\n Please type confirm");
                 statement = in.nextLine();
               if (statement.equalsIgnoreCase("Confirm"))
               {
                 System.out.print("Thank you");
               }
          }
          }     
        
System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

      }
      if (statement.equalsIgnoreCase("EmpAcess"))
      {
       System.out.print("What would you like to do?");
       statement = in.nextLine();
       if (statement.equalsIgnoreCase("BankAcess"))
      {
        System.out.print("Please enter pin: ");
        statement = in.nextLine();
        while (!statement.equals("hitesh"))
        {
          System.out.print("Incorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("THESE CHANGES ARE PERM");
        System.out.print("\nPlease enter Hitesh's Balance: ");
        statement = in.nextLine();
        hm.put("Hitesh", new Double(statement));
        System.out.print("Please enter Rohan's Balance: ");
        statement = in.nextLine();
        hm.put("Rohan", new Double(statement));
        System.out.print("Please enter Mohit's Balance: ");
        statement = in.nextLine();
        hm.put("Mohit", new Double(statement));
        System.out.print("Please enter Rohit's Balance: ");
        statement = in.nextLine();
        hm.put("Rohit", new Double(statement));
        System.out.print("Please enter Ashish's Balance: ");
        statement = in.nextLine();
        hm.put("Ashish", new Double(statement));
        System.out.print("Please enter Khariwal's Balance: ");
        statement = in.nextLine();
        hm.put("Khariwal", new Double(statement));
        System.out.print("Please enter Pankaj's Balance: ");
        statement = in.nextLine();
        hm.put("Pankaj", new Double(statement));
        System.out.print("Please enter "+name1+"'s Balance: ");
        statement = in.nextLine();
        hm.put( name1, new Double(statement));
        System.out.print("Please enter "+name2+"'s Balance: ");
        statement = in.nextLine();
        hm.put( name2, new Double(statement));
        System.out.print("Please enter "+name3+"'s Balance: ");
        statement = in.nextLine();
        hm.put( name3, new Double(statement));
        System.out.print("Please enter "+name4+"'s Balance: ");
        statement = in.nextLine();
        hm.put( name4, new Double(statement));
        System.out.print("Please enter "+name5+"'s Balance: ");
        statement = in.nextLine();
        hm.put( name5, new Double(statement));
        System.out.print("\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("\nThank you");
          }
          System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      }
        if (statement.equalsIgnoreCase("EmpAdd1"))
      {
        System.out.print("Please enter pin: ");
        statement = in.nextLine();
        while (!statement.equals("hitesh"))
        {
          System.out.print("Incorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("Please enter person's name: ");
        name1 = in.nextLine();
        System.out.print("How much money in the account: ");
        double num1 = in.nextDouble();
        System.out.print("What is the pin for this person");
        in.nextLine();
        statement = in.nextLine();
        name1pin = statement;
        hm.put( name1, new Double(num1));
        System.out.print(name1 + " has " + hm.get(name1));
        System.out.print("\nPlease type Confirm when finished");
        statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("\nThank you");
          }
          System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      }
       if (statement.equalsIgnoreCase("EmpAdd2"))
      {
        System.out.print("Please enter pin: ");
        statement = in.nextLine();
        while (!statement.equals("hitesh"))
        {
          System.out.print("Incorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("Please enter person's name: ");
        name2 = in.nextLine();
        System.out.print("How much money in the account: ");
        double num2 = in.nextDouble();
        System.out.print("What is the pin for this person");
        in.nextLine();
        statement = in.nextLine();
        name2pin = statement;
        hm.put( name2, new Double(num2));
        System.out.print(name2 + " has " + hm.get(name2));
        System.out.print("\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("\nThank you");
          }
          System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      }
        if (statement.equalsIgnoreCase("EmpAdd3"))
      {
        System.out.print("Please enter pin: ");
        statement = in.nextLine();
        while (!statement.equals("hitesh"))
        {
          System.out.print("Incorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("Please enter person's name: ");
        name3 = in.nextLine();
        System.out.print("How much money in the account: ");
        double num3 = in.nextDouble();
        System.out.print("What is the pin for this person");
        in.nextLine();
        statement = in.nextLine();
        name3pin = statement;
        hm.put( name3, new Double(num3));
        System.out.print(name3 + " has " + hm.get(name3));
        System.out.print("\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("\nThank you");
          }
          System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      }
        if (statement.equalsIgnoreCase("EmpAdd4"))
      {
        System.out.print("Please enter pin: ");
        statement = in.nextLine();
        while (!statement.equals("hitesh"))
        {
          System.out.print("Incorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("Please enter person's name: ");
        name4 = in.nextLine();
        System.out.print("How much money in the account: ");
        double num4 = in.nextDouble();
        System.out.print("What is the pin for this person");
        in.nextLine();
        statement = in.nextLine();
        name4pin = statement;
        hm.put( name4, new Double(num4));
        System.out.print(name4 + " has " + hm.get(name4));
        System.out.print("\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("\nThank you");
          }
          System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      }
        if (statement.equalsIgnoreCase("EmpAdd5"))
      {
        System.out.print("Please enter pin: ");
        statement = in.nextLine();
        while (!statement.equals("hitesh"))
        {
          System.out.print("Incorrect, Please try again: ");
          statement = in.nextLine();
        }
        System.out.print("Please enter person's name: ");
        name5 = in.nextLine();
        System.out.print("How much money in the account: ");
        double num5 = in.nextDouble();
        System.out.print("What is the pin for this person");
        in.nextLine();
        statement = in.nextLine();
        name5pin = statement;
        hm.put( name5, new Double(num5));
        System.out.print(name5 + " has " + hm.get(name5));
        System.out.print("\nPlease type Confirm when finished");
            statement = in.nextLine();
             if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("\nThank you");
          }
          System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      }
        
        if (statement.equalsIgnoreCase("Change Pin"))
         {
          System.out.print("Please enter pin: ");
        statement = in.nextLine();
        while (!statement.equals("hitesh"))
        {
          System.out.print("Incorrect, Please try again: ");
          statement = in.nextLine();
        }
        while (!statement.equalsIgnoreCase("exit"))
        {
        System.out.print("Whose pin would you like to change");
        statement = in.nextLine();
        while (!statement.equalsIgnoreCase(name1) && !statement.equalsIgnoreCase(name2) && !statement.equalsIgnoreCase(name3) && !statement.equalsIgnoreCase("Hitesh") && !statement.equalsIgnoreCase("Rohan") && !statement.equalsIgnoreCase("Rohit") && !statement.equalsIgnoreCase("Mohit") && !statement.equalsIgnoreCase("Ashish") && !statement.equalsIgnoreCase("Karival") && !statement.equalsIgnoreCase("Pankaj"))   
        {
          System.out.print("This person currently does not exist in this system\nPlease try again");
          statement = in.nextLine();
        }
        if (statement.equalsIgnoreCase("Hitesh"))
        {
          System.out.print("This is the original pin: " + Hiteshpin);
          System.out.print("\nWhat would you like to change it too: ");
          statement = in.nextLine();
          Hiteshpin = statement;
          System.out.print("You change the pin to: " + Hiteshpin + "\n Please enter confirm when finished");
          statement = in.nextLine();
             
          
        }
        if (statement.equalsIgnoreCase("Rohan"))
        {
          System.out.print("This is the original pin: " + Rohanpin);
          System.out.print("\nWhat would you like to change it too: ");
          statement = in.nextLine();
          Rohanpin = statement;
          System.out.print("You change the pin to: " + Rohanpin + "\n Please enter confirm when finished");
          statement = in.nextLine();
             
          
        }
        if (statement.equalsIgnoreCase("Rohit"))
        {
          System.out.print("This is the original pin: " + Rohitpin);
          System.out.print("\nWhat would you like to change it too: ");
          statement = in.nextLine();
          Rohitpin = statement;
          System.out.print("You change the pin to: " + Rohitpin + "\n Please enter confirm when finished");
          statement = in.nextLine();
             
          
        }
        if (statement.equalsIgnoreCase("Mohit"))
        {
          System.out.print("This is the original pin: " + Mohitpin);
          System.out.print("\nWhat would you like to change it too: ");
          statement = in.nextLine();
          Mohitpin = statement;
          System.out.print("You change the pin to: " + Mohitpin + "\n Please enter confirm when finished");
          statement = in.nextLine();
             
          
        }
        if (statement.equalsIgnoreCase("Ashish"))
        {
          System.out.print("This is the original pin: " + Ashishpin);
          System.out.print("\nWhat would you like to change it too: ");
          statement = in.nextLine();
          Ashishpin = statement;
          System.out.print("You change the pin to: " + Ashishpin + "\n Please enter confirm when finished");
          statement = in.nextLine();
             
          
        }
        if (statement.equalsIgnoreCase("Khariwal"))
        {
          System.out.print("This is the original pin: " + Khariwalpin);
          System.out.print("\nWhat would you like to change it too: ");
          statement = in.nextLine();
          Khariwalpin = statement;
          System.out.print("You change the pin to: " + Khariwalpin + "\n Please enter confirm when finished");
          statement = in.nextLine();
             
          
        }
        if (statement.equalsIgnoreCase("Pankaj"))
        {
          System.out.print("This is the original pin: " + Pankajpin);
          System.out.print("\nWhat would you like to change it too: ");
          statement = in.nextLine();
          Pankajpin = statement;
          System.out.print("You change the pin to: " + Pankajpin + "\n Please enter confirm when finished");
          statement = in.nextLine();
             
          
        }
        if (statement.equalsIgnoreCase(name1))
        {
          System.out.print("This is the original pin: " + name1pin);
          System.out.print("\nWhat would you like to change it too: ");
          statement = in.nextLine();
          name1pin = statement;
          System.out.print("You change the pin to: " + name1pin + "\n Please enter confirm when finished");
          statement = in.nextLine();
             
          
        }
        if (statement.equalsIgnoreCase(name1))
        {
          System.out.print("This is the original pin: " + name2pin);
          System.out.print("\nWhat would you like to change it too: ");
          statement = in.nextLine();
          name2pin = statement;
          System.out.print("You change the pin to: " + name2pin + "\n Please enter confirm when finished");
          statement = in.nextLine();
             
          
        }
        if (statement.equalsIgnoreCase(name3))
        {
          System.out.print("This is the original pin: " + name3pin);
          System.out.print("\nWhat would you like to change it too: ");
          statement = in.nextLine();
          name3pin = statement;
          System.out.print("You change the pin to: " + name3pin + "\n Please enter confirm when finished");
          statement = in.nextLine();
             
          
        }
        if (statement.equalsIgnoreCase(name4))
        {
          System.out.print("This is the original pin: " + name4pin);
          System.out.print("\nWhat would you like to change it too: ");
          statement = in.nextLine();
          name4pin = statement;
          System.out.print("You change the pin to: " + name4pin + "\n Please enter confirm when finished");
          statement = in.nextLine();
             
          
        }
        if (statement.equalsIgnoreCase(name5))
        {
          System.out.print("This is the original pin: " + name5pin);
          System.out.print("\nWhat would you like to change it too: ");
          statement = in.nextLine();
          name5pin = statement;
          System.out.print("You change the pin to: " + name5pin + "\n Please enter confirm when finished");
          statement = in.nextLine();
             
          
        }
           if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("\nThank you");
          }
          System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");              
        }
        }
        if (statement.equalsIgnoreCase("Active Users"))
        {
          System.out.print("Please enter pin: ");
          statement = in.nextLine();
           while (!statement.equals("hitesh"))
           {
          System.out.print("Incorrect, Please try again: ");
          statement = in.nextLine();
           }
           System.out.print("1 = " + name1 +  " " + hm.get(name1) + "\n2 = " + name2 +  " " + hm.get(name2) + "\n3 = " + name3 +  " " + hm.get(name3) + "\n4 = " + name4 +  " " + hm.get(name4) + "\n5 = " + name5 +  " " + hm.get(name5));
           System.out.print("\nPlease enter confirm when finished");
           statement = in.nextLine();
              if (statement.equalsIgnoreCase("Confirm"))
          {
                 System.out.print("Thank you");
          }
          else
          {
                 System.out.print("\nThank you");
          }
          System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
      }
     
       
     
    }
      
   
                      
  }
  }






  
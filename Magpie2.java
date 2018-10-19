/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *       Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
 /**
  * Get a default greeting  
  * @return a greeting
  */
 public String getGreeting()
 {
  return "Hello, let's talk.";
 }
 
 /**
  * Gives a response to a user statement
  * 
  * @param statement
  *            the user statement
  * @return a response based on the rules given
  */
 public String getResponse(String statement)
 {
  String response = "";
  if (statement.indexOf("no") >= 0)
  {
   response = "Why so negative?";
  }
  else if (statement.indexOf("mother") >= 0
    || statement.indexOf("father") >= 0
    || statement.indexOf("sister") >= 0
    || statement.indexOf("brother") >= 0)
  {
   response = "Tell me more about your family.";
  }
  else if (statement.equalsIgnoreCase("joke"))
  {
    response = getJoke();
  }
  else
  {
    response = getRandomResponse();
  }
  return response;
 }
 
private String getJoke()
 {
  final int NUMBER_OF_RESPONSES = 16;
  double r = Math.random();
  int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
  String response = "";
  
  if (whichResponse == 0)
  {
   response = "Interesting, tell me more.";
  }
  else if (whichResponse == 1)
  {
   response = "ASAINS ARE WORST AT DRIVING";
  }
  else if (whichResponse == 2)
  {
   response = "WHITE PEOPLE ARE THE WORST TYPE OF ICE CREAM";
  }
  else if (whichResponse == 3)
  {
   response = "https://www.youtube.com/watch?v=YSjsNzffUGQ";
  }
   else if (whichResponse == 4)
  {
   response = "WHY DO BLACK POEPLE AWAYS EAT FRIED CHICKEN\n\n\n...BECUASE THEY ARE JACKED UP ALL THE TIME";
  }
   else if (whichResponse == 5)
  {
   response = "INDIANS ARE MOSLY THE CAUSE OF HIT AND RUNS";
  } 
  else if (whichResponse == 6)
  {
   response = "You know that guy that called you yesterday about your computer? Yeah his name was not John, he was an indian scammer.";
  } 
  else if (whichResponse == 7)
  {
   response = "KEEEVVVINNNITOOOOOOOOO";
  } 
  else if (whichResponse == 8)
  {
   response = "VEEROOOOOOP";
  } 
   else if (whichResponse == 9)
  {
   response = "Q: Why is 88 better than 69?\nA: Because you get ate twice.";
  } 
    else if (whichResponse == 10)
  {
   response = "Q: Why is 88 better than 69?\nA: Because you get ate twice.";
  } 
   else if (whichResponse == 11)
  {
   response = "Q: Why did the married man sell his complete set of Encyclopedia Britannica?\nA: He didn't need them any longer -- his damn wife knows everything.";
  } 
  else if (whichResponse == 12)
  {
   response = "The kids doing drugs should be the only ones expected to get an 'A' in chemistry.\n 'Alright, I'll let you students know only one of you received 100% on the final lab exam:\n Brad Catlet for turning in the ounce of crystal meth.'";
  }    
  else if (whichResponse == 13)
  {
   response = "I wouldn't go to school. I thought all the kids at school were going to beat me up, which is absurd.\n They couldn't all beat me up -- someone had to hold me down.";
  } 
  else if (whichResponse == 14)
  {
   response = "Q: What did the dad buffalo say to his son on the first day of school?\nA: Bison";
  } 
  else if (whichResponse == 15)
  {
   response = "Mickey and Minnie have been having problems for some time now. \nAfter hearing of Barbie and Ken's breakup, they too decide to call it quits. Donald goes to Mickey to console him and says, \nShe's been a problem since day one. I'm glad you finally saw that she's crazy. Mickey looks at Donald and replies,\n No, I broke up with her because she's f**king Goofy.";
  } 
   else if (whichResponse == 15)
  {
   response = "https://www.youtube.com/watch?v=dQw4w9WgXcQ&autoplay=1";
   }
  return response;
}

 private String getRandomResponse()
 {
  final int NUMBER_OF_RESPONSES = 4;
  double r = Math.random();
  int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
  String response = "";
  
  if (whichResponse == 0)
  {
   response = "Interesting, tell me more.";
  }
  else if (whichResponse == 1)
  {
   response = "Hmmm.";
  }
  else if (whichResponse == 2)
  {
   response = "Do you really think so?";
  }
  else if (whichResponse == 3)
  {
   response = "You don't say.";
  }

  return response;
 }
}

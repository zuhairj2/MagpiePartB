/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
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
        if (statement.indexOf("dog")>= 0
                || statement.indexOf("cat")>=0)
        {
            response = "Tell me more about your pets";
        }
        else if (statement.indexOf("Kaehms") >= 0
                || statement.indexOf("Serrano") >= 0
                || statement.indexOf("Sosa") >= 0
                || statement.indexOf("Briggs") >= 0)
        {
            response = "He/She sounds like a good teacher";
        }
        else
        {
            response = getRandomResponse();
        }
        
        if (statement.indexOf("Pokemon")>= 0)
        {
            response = "I've been playing those series of games since I was 7";
        }
        else if (statement.indexOf("CSA") >= 0)
        {
            response = "Oh CSA, I love that class!";
        }
        else if (statement.indexOf("green") >=0)
        {
            response = "Woah, green is my favorite color!";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
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
        
        else if (whichResponse == 4)
        {
            response = "Ah ok i don’t think thay makes sense";
            
        }
        
        else if (whichResponse == 5)
        {
            response = "I think I need time to think about that";
            
        }

        return response;
    }
}

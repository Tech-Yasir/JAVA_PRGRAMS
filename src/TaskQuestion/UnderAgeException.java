package TaskQuestion;

public class UnderAgeException extends Exception {
	
	    UnderAgeException()
	    {
	        super("You Are Under Age");
	    }
	    UnderAgeException(String message)
	    {
	        super(message);
	    }
	}
	class Voting 
	{
	    public static void main(String[] args)
	    {
	        int age=19;
	        try
	        {
	            if(age<18)
	            {
	                throw new UnderAgeException();
	            }
	            else
	            {
	                System.out.println("You Are Eligible for Vote now..!!");
	            }
	        }
	        catch(UnderAgeException e)
	        {
	            e.printStackTrace();
	        }
	    }
	}


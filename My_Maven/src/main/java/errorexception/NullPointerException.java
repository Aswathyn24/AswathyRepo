package errorexception;

public class NullPointerException {

	public static void main(String[] args) 
	{
		try
		{
		
		String val=null;
		System.out.println(val.length());  /*Null Pointer Exception will come here*/

		}
		/*catch(Exception e)
		{
			System.out.println("Exception Handled");
			System.out.println(e);
		}*/
		
		finally
		{
		System.out.println("finally block");	
		}
		}
	}



package errorexceptionhandling;

public class ThrowException {
	
	public static void testThrow(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Eligible");  //Exception occurs here
		}
		
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) 
	{
		ThrowException.testThrow(17);  //Exception occurs here
		System.out.println("End of the Program");
	
	}

}

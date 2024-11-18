package errorexceptionhandling;

public class SampleException {
	
	public void test(int age) throws LicenseException
	{
		if(age<=18)
		{
			throw new LicenseException("Not Eligible"); // Custom exception thrown if age is 18 or below
		}
		
		else
		{
			System.out.println("Eligible");
		}
		
	}

	public static void main(String[] args) throws LicenseException {
		
		SampleException ob= new SampleException(); // Create an instance of SampleException
		ob.test(17); // Call the test method with age 17
	}

}

//Here method test that throws the LicenseException when certain conditions are not met

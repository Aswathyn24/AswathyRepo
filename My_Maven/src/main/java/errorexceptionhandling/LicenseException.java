package errorexceptionhandling;

public class LicenseException extends Exception {
	
	public LicenseException(String s)
	{
		super(s); /*Call the constructor of the superclass (Exception) to set the error message*/
		
	}
	

}


/* This LicenseException class created to handle cases where a "license" requirement is not met, if the person is being too young to be eligible*/
/*Constructor on line 5: It takes a String parameter, s, which represents the error message. It then passes this message to the superclass (Exception) constructor, which sets the exception’s error message*/
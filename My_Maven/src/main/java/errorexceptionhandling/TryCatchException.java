package errorexceptionhandling;
import java.lang.ArithmeticException;
public class TryCatchException 
{

	public static void main(String[] args) {
		int a=10;
		int b=0;
		System.out.println("Statement before exception");
		try
		{
		int c=a/b;
		}
		catch(Exception e)  //Instead of Exception, can be the exact name of specific exception
		{
			b=5;
			int d=a/b;   //Handling code for the try exception
			System.out.println(d);
			System.out.println(e); //Printing occurred exceptional error
		}
		finally
		{
			System.out.println("Statement after handling excpetion");
		}
		

	}
}

package abstractsample;

public abstract class AbstractClass3 
{
	public abstract void abstractName(); //semicolan is expected while creating an abstract method

	
	public void disp() //method created on parent class to call into the child class by creating a reference under main method
	{
		
		System.out.println("Instance method from abstract parent class");
	}

}


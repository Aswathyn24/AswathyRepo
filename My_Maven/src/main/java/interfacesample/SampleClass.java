package interfacesample;

public class SampleClass implements TestInterface {
	public void print()
	{
		System.out.println("Method of Class");
	}
	
	public void display()
	{
		System.out.println("First Method of Interface");
	}
	
	public void show()
	{
		System.out.println("Second Method of Interface");
	}

	public static void main(String[] args) 
	{
		SampleClass ob=new SampleClass();
		ob.print();
		ob.display();
		ob.show();
		
		TestInterface ob1=new SampleClass(); /*Interface has no constructor hence it is creating object for Interface in name of class*/ 
		//ob1.print(); If we are creating object in name of interface, then we can access only interface not the class methods
		ob1.display();
		ob1.show();

	}

}

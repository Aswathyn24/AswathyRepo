package interfacesample;

public class InterfaceClass implements InterfaceOne 
{

	
	
	/*public void interfacename()
	{
		System.out.println("Interface Method");
	}*/
	
	public void exam()
	{
		System.out.println("test");
	}

public static void main(String[] args) {
//System.out.println(InterfaceOne.a);
InterfaceClass ob=new InterfaceClass();
//ob.interfacename();
ob.exam();
		
}
}

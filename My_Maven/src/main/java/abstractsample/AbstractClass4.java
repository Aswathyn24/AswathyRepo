package abstractsample;

public class AbstractClass4 extends AbstractClass3 {

	public void abstractname()   //Implementation part of method in Parent class
    {
   	System.out.println("Child Method"); 
   	 
    }
    

	public static void main(String[] args) 
	{
		
		AbstractClass3 ob=new AbstractClass4(); //gave Parent class name as reference to call the abstract parent class, since it is unable to create an object on Parent Class
		ob.abstractname();
		ob.disp();  //calling parent abstract class here
	}

}

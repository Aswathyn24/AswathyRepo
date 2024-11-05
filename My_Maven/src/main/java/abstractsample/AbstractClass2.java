package abstractsample;

public class AbstractClass2 extends AbstractClass1 
{
     public void abstractname()   //Implementation part of method in Parent class
     {
    	System.out.println("Text for Abstract Method"); 
    	 
     }
     

	public static void main(String[] args) 
	{
		
		AbstractClass1 ob=new AbstractClass2();
		ob.abstractname();
		
	}

}

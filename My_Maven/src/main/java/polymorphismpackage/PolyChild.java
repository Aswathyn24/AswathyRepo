package polymorphismpackage;

public class PolyChild extends PolyParent {
	@Override
	
	public void display()
	{
		super.display();
		System.out.println("Method of Child Class");
	}

	public static void main(String[] args) 
	{
		
		PolyChild ob=new PolyChild();
		ob.display();
		PolyParent ob1=new PolyParent();
		ob1.display();
    

	}

}

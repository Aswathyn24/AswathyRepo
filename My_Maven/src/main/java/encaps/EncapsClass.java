package encaps;

public class EncapsClass {
	private String name;  /*Declared as private variable for name*/
	private int age;    /*Declared as private variable for age*/
	
	public void setData(String name,int age)  /*Setter Method*/
	{
		this.name=name;
		this.age=age;
		
	}
	
	public void getData() /*Getter Method*/
	
	{
		
		System.out.println("Name is: "+name);
		System.out.println("age is: "+age);
		
	}

}

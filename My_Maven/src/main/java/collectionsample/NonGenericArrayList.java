package collectionsample;

import java.util.ArrayList;

public class NonGenericArrayList {

	public static void main(String[] args) {
	
		ArrayList a=new ArrayList<String>();
		a.add("Hai");
		a.add(20);
		a.add("A");
		a.add(0.78f);
		
		System.out.println(a);
		

	}

}

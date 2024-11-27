package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List var = new ArrayList();
		
		var.add("Blue");
		var.add("Green");
		var.add("Red");
		var.add("Yellow");
		var.add("Green");
		
		System.out.println(var);
		
		var.set(1, "Black"); //to modify the list interface
		System.out.println(var);
		
		System.out.println(var.indexOf("Red")); //to print the index
		
		System.out.println(var.lastIndexOf("Green"));
		
		var.remove(2);
		System.out.println(var);
		
		System.out.println(var.get(2));
		
		System.out.println(var.contains("Pink"));
		System.out.println(var.contains("Green"));
		
		System.out.println(var.isEmpty());
		if(var.isEmpty())
		{
			System.out.println("This list is empty");
		}
		else
		{
			System.out.println("This list is not empty");
		}
		
		System.out.println(var.size());
		
	 for(int i=0; i<=var.size(); i++)
		{
			System.out.println(var.get(i));
		} 
	
		 
		 for (Object n : var) 
	        { 
	            String colors = (String) n; 
	            System.out.println(colors);
	        }

	}
}


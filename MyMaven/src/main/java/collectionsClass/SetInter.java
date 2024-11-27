package collectionsClass;

import java.util.HashSet;
import java.util.Set;

public class SetInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> ob = new HashSet <String>();
		ob.add("Java");
		ob.add("Python");
		ob.add("C");
		
		System.out.println(ob);
		
		ob.remove(4);
		System.out.println(ob);
		
		System.out.println(ob.contains("Pink"));
		System.out.println(ob.contains("Java"));
		
		System.out.println(ob.size());
		
		System.out.println(ob.isEmpty());
		if(ob.isEmpty())
		{
			System.out.println("This list is empty");
		}
		else
		{
			System.out.println("This list is not empty");
		}
		
		
		Set <String> obj = new HashSet <String>();
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Kiwi");
		System.out.println(obj);
		ob.addAll(obj);
		System.out.println(ob);
		
		System.out.println(ob.containsAll(obj));
		System.out.println(ob);
		System.out.println(obj);
		
		ob.clear();

	}

}

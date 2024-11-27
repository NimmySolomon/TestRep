package collectionsClass;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> ob = new ArrayList <String>();
		ob.add("Java");
		ob.add("Python");
		ob.add("C");
		
		System.out.println(ob);
		
		ArrayList <String> obj = new ArrayList <String>();
		
		obj.add("Developer");
		obj.add("QA");
		obj.add("BA");
		
		System.out.println(obj);
		
		System.out.println(ob.addAll(obj));
		System.out.println(ob);
		
		ob.remove(4);
		System.out.println(ob);
		
		ob.set(2, "C++");
		System.out.println(ob);
		
		System.out.println(ob.get(2));
		
		System.out.println(ob.size());
		
		Iterator itr = ob.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		itr.remove();
		System.out.println(ob);
		
		

	}

}

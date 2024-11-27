package collectionsClass;

import java.util.LinkedList;

public class NonGLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        LinkedList linkedList = new LinkedList();
		        
		        linkedList.add("Apple");
		        linkedList.add("Banana");
		        linkedList.add("Cherry");
		        linkedList.addFirst("Mango"); 
		        linkedList.addLast("Orange"); 
		        System.out.println("LinkedList: " + linkedList);
		        System.out.println("First element: " + linkedList.getFirst());
		        System.out.println("Last element: " + linkedList.getLast());
		        
		        linkedList.remove("Banana");
		        System.out.println(linkedList);
		        
		        for (Object obj : linkedList) 
		        { 
		            String fruit = (String) obj; 
		            System.out.println(fruit);
		        }


	}

}

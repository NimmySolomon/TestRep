package collectionsClass;

import java.util.Iterator;
import java.util.LinkedList;

public class Li {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.addFirst("Mango"); 
        linkedList.addLast("Orange"); 

        System.out.println("LinkedList: " + linkedList);

        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        linkedList.remove("Banana"); 
        System.out.println("After removal: " + linkedList);

        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
        
        System.out.println("\nIterator");
        Iterator itr=linkedList.iterator();  
        while(itr.hasNext()){  
         System.out.println(itr.next());  
        } 
    }

}

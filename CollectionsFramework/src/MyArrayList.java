import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Lion");
		list.add("Tiger");
		list.add("Jaguar");
		list.add("Panther");
		list.add("Elephant");
		list.add("Jackal");
		list.add("Wolf");
		
		//using for loop
		System.out.println("using for loop");
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//using for each loop
		System.out.println("\nusing for each loop");
		for(String obj: list) {
			System.out.println(obj);
		}
		
		//using iterator
		System.out.println("\nusing iterator");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//using list iterator
		System.out.println("\nusing list iterator");
		 ListIterator<String> itr1 = list.listIterator();
		 while(itr1.hasNext()) {
			 System.out.println(itr1.next());
		 }
		 //traversing reverse
		 System.out.println("\ntraversing reverse");
		 while(itr1.hasPrevious()) {
			 System.out.println(itr1.previous());
		 }

	}

}

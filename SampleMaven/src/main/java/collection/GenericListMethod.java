package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethod {

	public static void main(String[] args) {
		List <String> s = new ArrayList <String> ();
		// add () method
				s.add("apple");
				s.add("orange");
				s.add("kiwi");
				s.add("mango");
				s.add("kiwi");
				s.add("strawberry");
				s.add("banana");
				System.out.println(s);
				// get() method
				System.out.println(s.get(2));
				// set() method
				s.set(1,"watermellon");
				System.out.println(s);
				// indexOf () method
				System.out.println(s.indexOf("kiwi"));
				// lastIndexOf () method
				System.out.println(s.lastIndexOf("kiwi"));
				// remove () method
				s.remove("kiwi");
				System.out.println(s);
				// contains () method
				System.out.println(s.contains("orange"));
				// isEmpty () method
				System.out.println(s.isEmpty());
				// size () method
				System.out.println(s.size());
			}
				

	}



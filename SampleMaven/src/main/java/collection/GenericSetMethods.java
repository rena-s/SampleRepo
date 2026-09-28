package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set <String> a=new HashSet <String> ();
		// add () method
		a.add("apple");
		a.add("banana");
		a.add("orange");
		System.out.println(a);
		// addAll () method
		Set <String> b=new HashSet <String> ();
		b.add("grapes");
		b.add("watermelon");
		a.addAll(b);
		System.out.println(a);
		// contains () method
		System.out.println(a.contains("yellow"));
		// containsAll () method 
		System.out.println(a.containsAll(b));
		System.out.println(b.containsAll(a));
		// isEmpty () method
		System.out.println(a.isEmpty());
		// remove () method
		a.remove("apple");
		System.out.println(a);
		// removeAll () method
		a.removeAll(b);
		System.out.println(a);
		// size () method
		System.out.println(a.size());
		// clear () method
		a.clear();
		System.out.println(a);
		
		

	}

}

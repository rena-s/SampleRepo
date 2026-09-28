package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set <String> x=new HashSet <String>();
x.add("red");
x.add("green");
x.add("blue");
System.out.println(x);
Iterator it=x.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

	}

}

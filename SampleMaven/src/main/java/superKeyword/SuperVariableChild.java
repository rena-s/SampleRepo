package superKeyword;

public class SuperVariableChild extends SuperVariableParent{
	String name="Suresh";
	public void print()
	{ 
		System.out.println(super.name);
System.out.println(name);
	}
	public static void main(String[] args) {
		SuperVariableChild obj = new SuperVariableChild();
		obj.print();

	}

}

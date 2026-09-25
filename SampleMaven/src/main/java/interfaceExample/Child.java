package interfaceExample;

public class Child implements Parent{
public void show()
{
	System.out.println("weeee");
}
	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
		obj.print();
	obj.show();
	// Reference creation
	//Syntax-interfacename objectname = new classname();
	Parent obj1 = new Child();
	obj1.display();
	obj1.print();

	}

	@Override
	public void print() {
	System.out.println("hhhh");
		
	}

	@Override
	public void display() {
	System.out.println("lllll");
		
	}

}

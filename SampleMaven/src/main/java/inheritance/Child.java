package inheritance;

public class Child implements MultipleParent1,MultipleParent2{
public void show()
{
	System.out.println("RENA");
}
	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.print();
		obj.display();
        obj.show();
	}

	@Override
	public void display() {
		System.out.println("HELLOO");
		
	}

	@Override
	public void print() {
		System.out.println("myy");
		
	}

}

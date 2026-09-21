package inheritance;

public class HierarchicalChild1 extends HierarchicalParent{
	public  void show() 
	{
		System.out.println("me");
	}

	public static void main(String[] args) {
		HierarchicalChild1 obj =new HierarchicalChild1();
		obj.print();
		obj.show();

	}

}

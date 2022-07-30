package inheritance;
class GrandParent
{
	int cars=5;
	String bank_balace="10 lakh rupees";
	void property()//instance method
	{
		System.out.println(cars+"cars::"+bank_balace);
	}
}
class Parent extends GrandParent
{
	int cars=4;
	
}
class Child2 extends GrandParent
{

	public static void main(String[] args) {
		System.out.println("from child2 class");
		Child2 c2=new Child2();
		c2.property();

		//code to access protected properties.
		ProtectedTest pt=new ProtectedTest();
		System.out.println("from ProtectedTest class");
		System.out.println(pt.id);
		System.out.println(pt.name);
	}
}
public class Child extends Parent{

	public static void main(String[] args) {
		
		Child c=new Child();
		c.property();
		
		
	}

}

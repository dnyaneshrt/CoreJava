package inheritance;
class A{
	A(String name)
	{
		System.out.println("from A constrctor");
	}
}
class B extends A
{
	B()
	{
		super("super function");
		System.out.println("from B constrctor");
	}
	
}
class C extends B
{
	C()
	{
		System.out.println("from C constrctor");
	}
	
}

public class SuperFunTest {

	public static void main(String[] args) {
	C c=new C();
		
	}

}

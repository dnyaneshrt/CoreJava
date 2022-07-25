package inheritance;
class Gp
{
	int roll=300;
	String name="Om";
	String address="hadapsar";
}
class P extends Gp
{
	int roll=100;
	String name="Muntajar";
	String address="kondhwa";
	public void displayInfo()
	{
	
		System.out.println("roll no. "+roll);
		System.out.println("name. "+super.name);
		System.out.println("Address. "+address);
	}
	
}
class C1 extends P
{
	int roll=200;
	String name="Vijaya";
	String address="Lohegaon";
	public void displayInfo()
	{
		super.displayInfo();// will call parent class instance methos
	/*
		System.out.println("roll no. "+roll);
		System.out.println("name. "+super.name);
		System.out.println("Address. "+address);*/
	}
}

public class SuperTest {
	public static void main(String[] args) {
		C1 c=new C1();
		c.displayInfo();

	}
}

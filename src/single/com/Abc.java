package single.com;

public class Abc extends PartiallyAbstract {
	public void m1()
	{
		System.out.println("LOG");
	}
public void m2()
{
	System.out.println("LOO");
}
public static void main(String[] args)
{
	Abc a = new Abc();
	a.m1();
	a.m2();
	a.logo();
}
}

package single.com;

public class Triple extends Double
{
	public void m3()
	{
		System.out.println("quants");
	}
	public static void main(String[] args)
	{
		Triple d = new Triple ();
		{
			d.m1();
			d.m2();
			d.m3();
		}
}
}
package single.com;

public class Constructor {
	public  Constructor()
	{
		this("sowmi");
		System.out.println("Default constructor");
	}
	public Constructor(String name)
	{
		this(14);
		System.out.println(name);
	}
public Constructor(int id)
{
	this(2345.5678f);
	System.out.println(id);
}
public Constructor(float value)
{
	System.out.println(value);
	
}
public static void main(String[] args)
{
	Constructor v = new Constructor();
	
}
	
}
	


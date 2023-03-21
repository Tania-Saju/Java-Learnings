class MainClass3 
{
	public static void main(String[] args) 
	{
		new Demo1().getInstance().print();
	}
}
class Test1 
{
	public static void print() 
	{
		System.out.println("Hello World!");
	}
}
class Demo1 
{
	public Test1 getInstance() 
	{
		return new Test1();
	}
}

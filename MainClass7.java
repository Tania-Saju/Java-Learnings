class MainClass7
{
	public static void main(String[] args) 
	{
		 new Sample().getObject().getInstance().print();
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
class Sample 
{
	public Demo1 getObject() 
	{
		return new Demo1();
	}
}


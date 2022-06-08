class calculator 
{
	static void add(int a,int b)
	{
		int c=a+b;
		System.out.println("sum= "+ c);
	}
	static void sub(int a,int b)
	{
		System.out.println("sub= "+ (a-b));
	}
	static void mul(int a,int b)
	{
		System.out.println("multiplication= "+ (a*b));
	}
	static void div(int a,int b)
	{
		System.out.println("div= "+ (a/b));
	}
	public static void main(String[] args) 
	{
		
		char ch='d';
		switch(ch)
		{
			case'a': add(10,20);
			break;
			case's': sub(20,10);
			break;
			case'm' : mul(6,8);
			break;
			case'd': div(48,8);
			break;
			default: System.out.println("not calculatable");
		}
	}
}

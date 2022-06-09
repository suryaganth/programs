class primenumber 
{
	public static void main(String[] args) 
	{
		int num=20,count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}

	
	}
	   if(count==2)
		{System.out.println("this is primenumber=" + num);
		}
		else
			System.out.println("this is not primenumber");

}}

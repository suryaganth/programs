class star
{
	public static void main(String[] args) 
	{
		int k=1;
        for(int j=1;j<10;j++)
		{
		for (int i=1;i<=5;i++)
			if(i==1||i==5||j==1||j==5||j==9)
			{
			System.out.print("*");
			}
			else if(j>5)
			{
            System.out.print(k);
				k++;
			}
			else
			{
            System.out.print(" ");
			}
			System.out.println();
			

		}
	}
}


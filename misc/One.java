public class One
{
	public static void main(String[] args)
	{
		System.out.print(F(5));
		System.out.print(F2(5));

	}

	int F(int n)
	{
	  if (n == 0)
		return 0;``
	  return n + F(n - 1);
	}

	unsigned int F2(double x, unsigned int n)
	{
		if (n == 0)
		{
			return 0;
		}
		return n + F2(x, n-1);
	}

	
}

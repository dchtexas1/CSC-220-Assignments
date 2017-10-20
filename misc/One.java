public class One
{
	public static void main(String[] args)
	{
		String s = "";
		System.out.println("a) " + F(5));
		System.out.println("b) " + F2(0, 5));
		System.out.println("c) " + F3(5));
		System.out.println("d) " + F4(352));
		System.out.println("e) " + F5(5));
		System.out.println("5) " + F6(54321, s));
	}

	static int F(int n)
	{
		if (n == 0)
		{
			return 0;
		}
		return n + F(n - 1);
	}

	static int F2(double x, int n)
	{
		if (n == 0)
		{
			return 0;
		}
		return n + F2(x, n-1);
	}

	static int F3(int n)
	{
		if (n < 2)
		{
			return 0;
		}
		return 1 + F3(n / 2);
	}

	static int F4(int n)
	{
		if (n == 0)
		{
			return 0;
		}
		return F4(n / 10) + n % 10;
	}

	static int F5(int n)
	{
		if (n < 0)
		{
			return F5(-n);
		}
		if (n < 10)
		{
			return n;
		}
		return F5(n / 10);

	}

	static String F6(int n, String s)
	{
		if (n == 0)
		{
			return s;
		}
		s += n%10;
		return F6(n / 10, s);
	}
}
